package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.FeedBackDao;
import com.bzh.floodserver.model.Feedback;
import com.bzh.floodserver.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Resource
    private FeedBackDao feedBackDao;
    @Override
   public List<Feedback> findAll(){
        return  feedBackDao.findAll();
    }

    @Override
    public int addFeedBack(String contents,Date time,String uName){
       return feedBackDao.addFeedBack(contents,time,uName);
    }
}
