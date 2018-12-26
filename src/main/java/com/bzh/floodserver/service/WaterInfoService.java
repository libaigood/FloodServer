package com.bzh.floodserver.service;


import com.bzh.floodserver.model.sjappfu.*;

import java.util.List;

/**
 * 水情信息
 * */
public interface WaterInfoService {
	//河道信息
	public List<WaterInfo_river_all> river_all(String stm, String etm, String addvcd); 
	public List<WaterInfo_river_one> river_one(String stcd, String stm, String etm);
	public WaterInfo_river_one river_detailed(String stcd); 
	
	//水库信息
	public List<WaterInfo_reservoir_all> reservoir_all(String stm, String etm, String addvcd);
	public List<WaterInfo_reservoir_one> reservoir_one(String stcd, String stm, String etm);
	public WaterInfo_reservoir_one reservoir_detailed(String stcd); 
}
