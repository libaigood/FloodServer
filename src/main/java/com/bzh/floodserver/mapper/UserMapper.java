package com.bzh.floodserver.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Author: libai
 * @Date: 2019/5/16 10:00
 * @Version 1.0
 * @Description:
 */
@Repository
public interface UserMapper {
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
    Integer getUserId(String userName);

}
