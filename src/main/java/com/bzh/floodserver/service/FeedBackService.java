package com.bzh.floodserver.service;

import com.bzh.floodserver.model.Feedback;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface FeedBackService {
    //查询所有
    List<Feedback> findAll();
    //添加一条数据
    int addFeedBack(String contents,Date time,String uName);
}
