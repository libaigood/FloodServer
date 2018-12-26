package com.bzh.floodserver.mapper;


import com.bzh.floodserver.model.sjappfu.BasicInformation;
import com.bzh.floodserver.model.sjappfu.DJ_AD;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OtherDao {

	public List<BasicInformation> allStcds();
	
	public List<DJ_AD> allAddvcds();
	
}
