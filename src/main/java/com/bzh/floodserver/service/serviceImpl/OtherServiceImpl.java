package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.OtherDao;
import com.bzh.floodserver.model.sjappfu.BasicInformation;
import com.bzh.floodserver.model.sjappfu.DJ_AD;
import com.bzh.floodserver.service.OtherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OtherServiceImpl implements OtherService {
	
	@Resource
	OtherDao otherDao;

	@Override
	public List<BasicInformation> allStcds() {
		
		return otherDao.allStcds();
	}

	@Override
	public List<DJ_AD> allAddvcds() {
		
		return otherDao.allAddvcds();
	}

}
