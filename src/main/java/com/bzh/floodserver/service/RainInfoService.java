package com.bzh.floodserver.service;



import com.bzh.floodserver.model.sjappfu.*;

import java.util.List;
import java.util.Map;

/**
 * 雨情信息
 * */
public interface RainInfoService {
	//雨量信息
	public List<Rainfalls_all> rainfalls_all(String stm, String etm, String addvcd);
	public List<Rainfalls_one> rainfalls_one(String stcd, String stm, String etm, int timelength);
	//雨强信息
	public Map<String, List<RainIntensity_all>> rainIntensity_all(String stm, String etm, String addvcd);
	public List<RainIntensity_one> rainIntensity_one(String stcd, String stm, String etm, int timelength);
	//区域降雨统计
	public Map<String, List<RegionalRainfall>> regionalRainfall(String stm, String etm);
	
	public Rainfalls_one rain_detailed(String stcd);

}
