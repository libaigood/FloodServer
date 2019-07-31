package com.bzh.floodserver.controller;

import com.bzh.floodserver.model.user.Friend;
import com.bzh.floodserver.model.user.FriendsInfo;
import com.bzh.floodserver.model.user.UserInfo;
import com.bzh.floodserver.service.UserService;
import com.bzh.floodserver.utils.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

/**
 * @Author: libai
 * @Date: 2019/6/3 9:42
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("server/chatController")
public class ChatController {

    private final UserService userService;








    @Autowired
    public ChatController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 获取用户信息
     *
     * @param username
     * @return
     */
    @GetMapping("/get-user-info")
    public ResultMap getUserInfo(@RequestParam("username") String username) {
        //log.warn("username");
        UserInfo userInfo = userService.getUserInfoByName(username);
        return new ResultMap().success().message("").data(userInfo);
    }

    /**
     * 获取用户信息
     *
     * @param username
     * @return
     */
    @GetMapping("/get-user-infos")
    public ResultMap getUserInfos(@RequestParam("username") String username) {
        //log.warn("username");
        List<UserInfo> userInfo = userService.getUserInfosByName(username);
        return new ResultMap().success().message("").data(userInfo);
    }

    /**
     * 添加好友
     *
     * @param friend
     * @return
     */

    @PostMapping("/addFriend")
    public ResultMap addFriend(Friend friend) {
        int sign = userService.addFriends(friend);
        if (sign == 1) {
            return new ResultMap().success().message("添加成功").data(true);
        } else if (sign == 2) {
            return new ResultMap().success().message("添加失败，该好友已添加").data(false);
        } else {
            return new ResultMap().success().message("添加失败").data(false);
        }
    }

    /**
     * 推荐好友
     *
     * @return
     */
    @GetMapping("/recommendFriend")
    public ResultMap recommendFriends(String username) {
		/*int num = userService.findAllNum();
		Random random = new Random();
		int[] ids = new int[5];
		for (int i = 0; i < ids.length; i++) {
			ids[i] = random.nextInt(num);
		}*/
        List<UserInfo> users = userService.recommendFriends();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                users.remove(users.get(i));
            }
        }
        return new ResultMap().success().message("推荐好友成功了吗").data(users);
    }

    /**
     * 查询好友，好友列表
     *
     * @return
     */
    @ApiOperation(value = "获取所有好友信息(所有)")
    @ApiImplicitParam(name = "username", value = "当前用户", required = true, dataType = "String", paramType = "query")
    @GetMapping("/getFriends")
    public ResultMap getFriends(@RequestParam("username") String username) {
        List<FriendsInfo> users = userService.selectFriendByUsername(username);
        return new ResultMap().success().message("查询成功").data(users);
    }

    /**
     * 上传头像
     *
     * @param username
     * @param headPortrait
     * @return
     */
    @PostMapping("uploadPng")
    public ResultMap shangchuan(String username, MultipartFile headPortrait) {
        int as = userService.uploadpicture(username, headPortrait);
        if (as > 0) {
            return new ResultMap().success().message("上传成功").data(true);
        } else {
            return new ResultMap().success().message("上传失败").data(false);
        }
    }

    /**
     * 获取指定用户的头像信息
     *
     * @param username
     * @param response
     */

    @GetMapping("getloadPng")
    public void getloadPng(String username, HttpServletResponse response) {
        try {
            OutputStream out = response.getOutputStream();
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode("", "UTF-8"));
            String dedao = userService.getloadPng(username);
            //out.write(dedao);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @ApiOperation("删除好友")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "当前用户", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "friendName", value = "要删除的好友", required = true, dataType = "String", paramType = "query")
    })
    @GetMapping("deleteFriend")
    public ResultMap deleteFriend(String username, String friendName) {
        boolean val = userService.deleteFriend(username, friendName);
        if (val) {
            return new ResultMap().success().message("删除成功").data(true);
        } else {
            return new ResultMap().success().message("删除失败").data(false);
        }
    }
}
