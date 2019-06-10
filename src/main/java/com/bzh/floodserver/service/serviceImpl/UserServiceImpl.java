package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.core.websocke.WebSocketService;
import com.bzh.floodserver.mapper.UserMapper;
import com.bzh.floodserver.model.user.*;
import com.bzh.floodserver.service.UserService;
import com.bzh.floodserver.utils.CommonUtils;
import org.java_websocket.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: libai
 * @Date: 2019/5/16 10:05
 * @Version 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private WebSocketService webSocketService;

    @Override
    public String getPassword(String userName) {
        return userMapper.getPassword(userName);
    }

    @Override
    public String getRole(String userName) {
        return userMapper.getRole(userName);
    }

    @Override
    public User getUserId(String userName) {
        return userMapper.getUserId(userName);
    }



    @Override
    public LoginDetail getLoginDetail(String username) {
        User loginDetail = userMapper.getUserId(username);
        User user = loginDetail;
        return loginDetail;
    }

//    @Override
//    public String generateToken(TokenDetail tokenDetail) {
//        return tokenUtils.generateToken(tokenDetail);
//    }

    @Override
    public UserInfo getUserInfoByName(String username) {
        UserInfo userInfo = userMapper.getUserInfoByName(username);
        userInfo.setHeadportrait(CommonUtils.imgtobyte(userInfo.getHeadportrait()));
        return userInfo;
    }

    @Override
    public List<UserInfo> getUserInfosByName(String username) {
        username = "%" + username + "%";
        List<UserInfo> list = userMapper.getUserInfosByName(username);
        for (UserInfo userInfo : list) {
            userInfo.setHeadportrait(CommonUtils.imgtobyte(userInfo.getHeadportrait()));
        }
        return list;
    }

    @Override
    public List<UserInfo> recommendFriends() {
        List<UserInfo> list = userMapper.recommendFriends();
        for (UserInfo userInfo : list) {
            userInfo.setHeadportrait(CommonUtils.imgtobyte(userInfo.getHeadportrait()));
        }
        return list;
    }

    @Transactional
    @Override
    public boolean register(RequestRegister requestRegister) {
        int v = 0;
        try {
            v = userMapper.register(requestRegister);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return v > 0;
    }

    @Transactional
    @Override
    public boolean updateUserInfo(String username, Map<String, String> userInfo) {
        int v = userMapper.updateUserInfo(username, userInfo);
        return v > 0;
    }

    @Transactional
    @Override
    public boolean updateUserRole(String username, int role) {
        int v = userMapper.updateUserRole(username, role);
        return v > 0;
    }

    @Transactional
    @Override
    public Integer addFriends(Friend friend) {
        String username = friend.getUsername();
        String friendName = friend.getFriendName();
        String remarkName = friend.getRemarkName();
        if (remarkName == null || remarkName.equals("")) {
            remarkName = friendName;
        }
        int userId = userMapper.getIdByUserName(username);
        int friendId = userMapper.getIdByUserName(friendName);
        int isExit = userMapper.isExitFriend(userId, friendId);
        if (isExit == 0) {
            return userMapper.addFriends(userId, friendId, remarkName);
        } else {
            return 2;
        }
    }

    @Transactional
    @Override
    public boolean addMessage(Talk talk) {
        int v = userMapper.addMessage(talk);
        return v > 0;
    }

    @Override
    public int findAllNum() {
        return userMapper.findAllNum();
    }

    @Override
    public List<FriendsInfo> selectFriendByUsername(String username) {
        List<FriendsInfo> friendsInfos = userMapper.selectFriendByUsername(username);
        for (FriendsInfo inf : friendsInfos) {
            inf.setHeadportrait(CommonUtils.imgtobyte(inf.getHeadportrait()));
        }
        return friendsInfos;
    }

    @Override
    public int uploadpicture(String username, MultipartFile file) {
        File directory = new File("");//设定为当前文件夹
        String str = directory.getAbsolutePath() + "/src/main/resources/static/Headportrait/" + username + ".ico";
        int sign = userMapper.uploadpicture(username, str);
        if (sign > 1) {
            try {
                file.transferTo(new File(directory.getAbsolutePath() + "/src/main/resources/static/Headportrait/" + username + ".ico"));
            } catch (IOException e) {
                e.printStackTrace();
                sign = 0;
            }
        }
        if(sign > 1){
            WebSocket webSocket = webSocketService.getWebSocketByUsername(username);
            if(webSocket.isOpen()){
                List<FriendsInfo> friendsInfos = userMapper.selectFriendByUsername(username);
                for (FriendsInfo friendsInfo : friendsInfos){
                    String friendName = friendsInfo.getUsername();
                    WebSocket friendWS = webSocketService.getWebSocketByUsername(friendName);
                    if(friendWS.isOpen()){
                        Long talkID = UUID.randomUUID().getLeastSignificantBits();
                        Talk talk = new Talk(talkID,"300",username,friendName,new Date(), CommonUtils.imgtobyte(str));
                        webSocketService.sendToSingle(friendWS,talk);
                    }
                }
            }
        }
        return sign;
    }

    @Override
    public String getloadPng(String username) {
        String dedao = userMapper.getloadPng(username);
        return CommonUtils.imgtobyte(dedao);
    }

    @Override
    public List<Talk> getmessage(String username) {

        return userMapper.getmessage(username);
    }

    @Override
    public int upmespush(Long id) {
        return userMapper.upmespush(id);
    }

    @Override
    public boolean deleteFriend(String username, String friendName) {
        int val = userMapper.deleteFriend(username,friendName);
        return val > 0;
    }
}
