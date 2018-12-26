package com.bzh.floodserver.mapper;

import com.bzh.floodserver.model.Feedback;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import java.util.Date;
import java.util.List;
@Repository
public interface FeedBackDao {
    //查询所有
    List<Feedback> findAll();
    //添加一条数据
    int addFeedBack(@Param("contents")String contents, @Param("time")Date time, @Param("uName")String uid);

}
