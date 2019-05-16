package com.bzh.floodserver.service;

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
}
