package com.bzh.floodserver.service.serviceImpl;


import com.bzh.floodserver.model.sjappfu.*;
import com.bzh.floodserver.service.*;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 汛情摘要
 * */
@Service
public class FloodAbstractImpl implements FloodAbstractService {

	@Resource
	private RainInfoService rainInfoService;

	@Resource
	private WaterInfoService waterInfoService;
	
	//雨量
	public Map<String , Integer> floodAbstract_rain(String stm,String etm, String addvcd) throws NoDataException {
		int[] nums = {0,10,25,50,100,250,2147483647};
		List<Rainfalls_all> list = rainInfoService.rainfalls_all(stm, etm, addvcd);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		int[] abc = new int[nums.length-1];
		for(int i = 0; i < list.size(); i++) {
			double drp = list.get(i).getDrp();
			for(int j = 0; j < nums.length-1; j++) {
				if(nums[j] <drp && drp< nums[j+1]) {
					abc[j]++;
				}
			}
		}

		Map<String , Integer> map=new LinkedHashMap<String , Integer>();
		for(int i=0; i<abc.length; i++) {
			map.put(nums[i]+" ~ "+(nums[i+1] == 2147483647? "" : nums[i+1]), abc[i]);
		}
		return map;

	}

	public List<Rainfalls_all> floodAbstract_rain_all(String stm,String etm, int[] nums, String addvcd)throws NoDataException{
		List<Rainfalls_all> list = rainInfoService.rainfalls_all(stm, etm, addvcd);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		List<Rainfalls_all> newlist = new ArrayList<Rainfalls_all>();
		for(int i = 0; i < list.size(); i++) {
			double drp = list.get(i).getDrp();
			if(nums[0] < drp && drp < nums[1]) {
				newlist.add(list.get(i));
			}
		}
		return newlist;
	}

	public List<Rainfalls_one> floodAbstract_rain_one(String stcd, String stm,String etm, int timelength)throws NoDataException{
		List<Rainfalls_one> list = rainInfoService.rainfalls_one(stcd, stm, etm, timelength);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		return list;
	}
	
	public Rainfalls_one floodAbstract_rain_detailed(String stcd)throws NoDataException{
		Rainfalls_one rrf = rainInfoService.rain_detailed(stcd);
		if(rrf == null) {
			throw new NoDataException("没有数据！");
		}
		return rrf;
	}

	//河道
	public List<WaterInfo_river_all> floodAbstract_river(String stm,String etm, String addvcd)throws NoDataException{
		List<WaterInfo_river_all> list = waterInfoService.river_all(stm, etm,addvcd);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		List<WaterInfo_river_all> newlist = new ArrayList<WaterInfo_river_all>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getCjjsw() > 0) {
				newlist.add(list.get(i));
			}
		}
		return newlist;
	}

	public List<WaterInfo_river_all> floodAbstract_river_all(String stm,String etm, String addvcd)throws NoDataException{
		List<WaterInfo_river_all> list = waterInfoService.river_all(stm, etm, addvcd);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		return list;
	}

	public List<WaterInfo_river_one> floodAbstract_river_one(String stcd, String stm,String etm)throws NoDataException{
		List<WaterInfo_river_one> list = waterInfoService.river_one(stcd, stm, etm);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		return list;
	}
	
	public WaterInfo_river_one floodAbstract_river_detailed(String stcd) {
		WaterInfo_river_one rrf = waterInfoService.river_detailed(stcd);
		if(rrf == null) {
			throw new NoDataException("没有数据！");
		}
		return rrf;
	}
	//水库
	public List<WaterInfo_reservoir_all> floodAbstract_reservoir(String stm,String etm, String addvcd)throws NoDataException{
		List<WaterInfo_reservoir_all> list = waterInfoService.reservoir_all(stm, etm, addvcd);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		return list;
	}

	public List<WaterInfo_reservoir_all> floodAbstract_reservoir_all(String stm,String etm, String addvcd)throws NoDataException{
		List<WaterInfo_reservoir_all> list = waterInfoService.reservoir_all(stm, etm, addvcd);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		return list;
	}
	public List<WaterInfo_reservoir_one> floodAbstract_reservoir_one(String stcd, String stm,String etm)throws NoDataException{
		List<WaterInfo_reservoir_one> list = waterInfoService.reservoir_one(stcd, stm, etm);
		if(list.size()==0) {
			throw new NoDataException("没有数据！");				
		}
		return list;
	}
	
	public WaterInfo_reservoir_one floodAbstract_reservoir_detailed(String stcd) {
		WaterInfo_reservoir_one rrf = waterInfoService.reservoir_detailed(stcd);
		if(rrf == null) {
			throw new NoDataException("没有数据！");
		}
		return rrf;
	}
}
