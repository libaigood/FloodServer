package com.bzh.floodserver.service;

import com.bzh.floodserver.model.sjappfu.*;

import java.util.List;
import java.util.Map;

/**
 * 汛情摘要
 * */
public interface FloodAbstractService {
	//雨量
	public Map<String , Integer> floodAbstract_rain(String stm, String etm, String addvcd);
	public List<Rainfalls_all> floodAbstract_rain_all(String stm, String etm, int[] nums, String addvcd);
	public List<Rainfalls_one> floodAbstract_rain_one(String stcd, String stm, String etm, int timelength);
	public Rainfalls_one floodAbstract_rain_detailed(String stcd);
	//河道
	public List<WaterInfo_river_all> floodAbstract_river(String stm, String etm, String addvcd);
	public List<WaterInfo_river_all> floodAbstract_river_all(String stm, String etm, String addvcd);
	public List<WaterInfo_river_one> floodAbstract_river_one(String stcd, String stm, String etm);
	public WaterInfo_river_one floodAbstract_river_detailed(String stcd);
	//水库
	public List<WaterInfo_reservoir_all> floodAbstract_reservoir(String stm, String etm, String addvcd);
	public List<WaterInfo_reservoir_all> floodAbstract_reservoir_all(String stm, String etm, String addvcd);
	public List<WaterInfo_reservoir_one> floodAbstract_reservoir_one(String stcd, String stm, String etm);
	public WaterInfo_reservoir_one floodAbstract_reservoir_detailed(String stcd);
}
