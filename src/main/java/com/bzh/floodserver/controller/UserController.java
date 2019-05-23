package com.bzh.floodserver.controller;

import com.bzh.floodserver.model.user.UserStcd;
import com.bzh.floodserver.service.StcdService;
import com.bzh.floodserver.service.UserService;
import com.bzh.floodserver.utils.ResultMap;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Size;
import java.util.List;

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
    @Autowired
    private StcdService stcdService;


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
            return new ResultMap().success();
        }
        return new ResultMap().fail("405").message("权限错误！");
    }

    /**
     * 用户添加自己关注的站号
     * @param id 用户的id
     * @param list 站号的集合
     * @return ResultMap中success或者fail是代码号，data是数据
     */
    @RequestMapping(value = "/addUserStcd")
    public ResultMap addUserStcd(int id, List<Integer> list) {
        int no = stcdService.addUserStcd(id, list);
        if (no != 0) {
            return new ResultMap().success().data("添加成功");
        }
        return new ResultMap().fail("405").data("添加失败");
    }

    /**
     * 用户查询自己关注的站号
     * @param id 用户id
     * @return ResultMap中success或者fail是代码号，data是数据
     */
    @RequestMapping(value = "/selectById")
    public ResultMap selectById(int id) {
        List<String> userStcd = stcdService.selectById(id);
        return new ResultMap().success().data(userStcd);
    }

}
