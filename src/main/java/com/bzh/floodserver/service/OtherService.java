package com.bzh.floodserver.service;


import com.bzh.floodserver.model.sjappfu.BasicInformation;
import com.bzh.floodserver.model.sjappfu.DJ_AD;

import java.util.List;

public interface OtherService {
	
	public List<BasicInformation> allStcds();
	
	public List<DJ_AD> allAddvcds();
	
}
