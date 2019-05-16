package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.UserMapper;
import com.bzh.floodserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Override
    public String getPassword(String userName) {
        return userMapper.getPassword(userName);
    }

    @Override
    public String getRole(String userName) {
        return userMapper.getRole(userName);
    }
}
