package com.bzh.floodserver.controller;

import com.bzh.floodserver.utils.ResultMap;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 异常处理 controller
 * @Date 2018-05-02
 * @Time 20:40
 */
@RestControllerAdvice
public class ExceptionController {

    /**
     * 捕捉 CustomRealm 抛出的异常
     */
    @ExceptionHandler(AccountException.class)
    public ResultMap handleShiroException(Exception ex) {
        return new ResultMap().fail("ExceptionController").message(ex.getMessage());
    }
}
