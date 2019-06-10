package com.bzh.floodserver.service;

import com.bzh.floodserver.model.user.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;
/**
 * @Author: libai
 * @Date: 2019/5/16 10:04
 * @Version 1.0
 * @Description:
 */
public interface UserService {
    /**
     * 根据用户名获取密码
     * @param userName
     * @return
     */
    String getPassword(String userName);

    /**
     * 根据用户名获取权限
     * @param userName
     * @return
     */
    String getRole(String userName);

    /**
     *  根据用户名获取用戶id
     * @param userName
     * @return
     */
    User getUserId(String userName);




    //根据用户名获取用户主要信息
    LoginDetail getLoginDetail(String username);

    //得到token
    //String generateToken(TokenDetail tokenDetail);

    //根据指定用户名查询
    UserInfo getUserInfoByName(String username);

    //根据用户名模糊查询
    List<UserInfo> getUserInfosByName(String username);

    //随机获取用户
    List<UserInfo> recommendFriends();

    //注册
    boolean register(RequestRegister requestRegister);

    //完善用户信息
    boolean updateUserInfo(String username, Map<String, String> userInfo);

    //更改用户角色权利
    boolean updateUserRole(String username, int role);

    //添加好友
    //0:添加失败 1:添加成功 2:该好友已存在
    Integer addFriends(Friend friend);

    //发送消息
    boolean addMessage(Talk talk);

    //获取所有用户数量
    int findAllNum();

    //好友列表，查询好友
    List<FriendsInfo> selectFriendByUsername(String username);

    //上传/修改头像
    int uploadpicture(String username, MultipartFile File);

    //获取头像
    String getloadPng(String username);

    //获取未读消息
    List<Talk> getmessage(String username);

    //登陆后推送
    int upmespush(Long id);

    //删除好友
    boolean deleteFriend(String username, String friendName);
}
