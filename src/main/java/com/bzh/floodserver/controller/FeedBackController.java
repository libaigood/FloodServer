package com.bzh.floodserver.controller;

import com.bzh.floodserver.model.Feedback;
import com.bzh.floodserver.service.FeedBackService;
import com.bzh.floodserver.utils.Data;
import com.bzh.floodserver.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
public class FeedBackController {
    @Resource
    private FeedBackService feedBackService;
    @RequestMapping("findAll")
    public ResultMap findAll(){
        List<Feedback> list=feedBackService.findAll();
        return  new ResultMap().success().message("success").data(list);
    }
    @PostMapping("addFeedBack")
    public ResultMap addFeedBack(String contents,String uName){
        int count=feedBackService.addFeedBack(contents,new Date(),uName);
        if(count!=0){
            return  new ResultMap().success().message("添加成功").data(true);
        }else {
            return  new ResultMap().fail("422").message("注册失败").data(false);
        }

    }
}
