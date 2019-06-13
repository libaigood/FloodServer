package com.bzh.floodserver.controller;

import com.bzh.floodserver.model.user.User;

import com.bzh.floodserver.service.UserService;
import com.bzh.floodserver.utils.ResultMap;
import com.bzh.floodserver.utils.Statuscode;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: libai
 * @Date: 2019/5/16 11:08
 * @Version 1.0
 * @Description:
 */

@RestController
@RequestMapping("usercontroller")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultMap login( String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        String role = userService.getRole(username);
        if ("user".equals(role) || "admin".equals(role)) {
            User user = userService.getUserId(username);
            Map map=new HashMap();
            map.put("id",user.getId());
            map.put("username",user.getUsername());
            return new ResultMap().success().data(map);
        }
        return new ResultMap().fail(Statuscode.permissionError);
    }

    /**
     * 没有权限
     * @return
     */
    @RequestMapping(value = "/notRole")
    public ResultMap notRole() {
        return new ResultMap().fail(Statuscode.permissionError);
    }

    /**
     * 没有登录
     * @return
     */
    @RequestMapping(value = "/notLogin")
    public ResultMap notLogin() {
        return new ResultMap().fail(Statuscode.notLogin);
    }


}
