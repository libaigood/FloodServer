package com.bzh.floodserver.controller;

import com.bzh.floodserver.service.FloodAbstractService;
import com.bzh.floodserver.utils.JsonResult;
import com.bzh.floodserver.utils.NoDataException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * 汛情摘要
 * */
@Controller
@RequestMapping("server/floodAbstract")
public class FloodAbstractController {
	
	@Resource
	FloodAbstractService floodAbstractService;
	
	/**
	 * 雨量
	 * */
	
	//首页统计部分
	@RequestMapping("floodAbstract_rain")
	@ResponseBody
	public Object floodAbstract_rain(String stm,String etm, String addvcd){
		return new JsonResult(floodAbstractService.floodAbstract_rain(stm, etm, addvcd));
	}
	
	//点击量级后，该量级中的所有站
	@RequestMapping("floodAbstract_rain_all")
	@ResponseBody
	public Object floodAbstract_rain_all(String stm,String etm, String nums, String addvcd ){
		String[] strs = nums.split(" ~ ");
		int[] num = new int[2];
		if(strs[0].equals("250")) {
			num[0] = Integer.parseInt(strs[0]);
			num[1] = 2147483647; 
		}else {
			num[0] = Integer.parseInt(strs[0]);
			num[1] = Integer.parseInt(strs[1]);
		}
		System.out.println("Arrays.toString:"+Arrays.toString(num));
		return new JsonResult(floodAbstractService.floodAbstract_rain_all(stm, etm, num, addvcd));
	}
	
	//单个站的值
	@RequestMapping("floodAbstract_rain_one")
	@ResponseBody
	public Object floodAbstract_rain_one(String stcd, String stm,String etm, int timelength){
		return new JsonResult(floodAbstractService.floodAbstract_rain_one(stcd, stm, etm, timelength));
	}
	
	//站点详细信息
	@RequestMapping("floodAbstract_rain_detailed")
	@ResponseBody
	public Object floodAbstract_rain_detailed(String stcd){
		return new JsonResult(floodAbstractService.floodAbstract_rain_detailed(stcd));
	}
	
	/**
	 * 河道
	 * */
	
	//首页统计部分，只显示超预警站点
	@RequestMapping("floodAbstract_river")
	@ResponseBody
	public Object floodAbstract_river(String stm,String etm, String addvcd){
		return new JsonResult(floodAbstractService.floodAbstract_river(stm, etm, addvcd));
	}
	
	//点击后进入，显示所有站点
	@RequestMapping("floodAbstract_river_all")
	@ResponseBody
	public Object floodAbstract_river_all(String stm,String etm, String addvcd){
		return new JsonResult(floodAbstractService.floodAbstract_river_all(stm, etm, addvcd));
	}
	
	//单个站的值
	@RequestMapping("floodAbstract_river_one")
	@ResponseBody
	public Object floodAbstract_river_one(String stcd, String stm,String etm){
		return new JsonResult(floodAbstractService.floodAbstract_river_one(stcd, stm, etm));
	}
	
	//站点详细信息
	@RequestMapping("floodAbstract_river_detailed")
	@ResponseBody
	public Object floodAbstract_river_detailed(String stcd){
		return new JsonResult(floodAbstractService.floodAbstract_river_detailed(stcd));
	}
	
	/**
	 * 水库
	 * */
	
	//首页统计部分，只显示超预警站点
	@RequestMapping("floodAbstract_reservoir")
	@ResponseBody
	public Object floodAbstract_reservoir(String stm,String etm, String addvcd){
		return new JsonResult(floodAbstractService.floodAbstract_reservoir(stm, etm, addvcd));
	}
	
	//点击后进入，显示所有站点
	@RequestMapping("floodAbstract_reservoir_all")
	@ResponseBody
	public Object floodAbstract_reservoir_all(String stm,String etm, String addvcd){
		return new JsonResult(floodAbstractService.floodAbstract_reservoir_all(stm, etm, addvcd));
	}
	
	//单个站的值
	@RequestMapping("floodAbstract_reservoir_one")
	@ResponseBody
	public Object floodAbstract_reservoir_one(String stcd, String stm,String etm){
		return new JsonResult(floodAbstractService.floodAbstract_reservoir_one(stcd, stm, etm));
	}
	
	//站点详细信息
	@RequestMapping("floodAbstract_reservoir_detailed")
	@ResponseBody
	public Object floodAbstract_reservoir_detailed(String stcd){
		return new JsonResult(floodAbstractService.floodAbstract_reservoir_detailed(stcd));
	}
	
	//异常
	@ExceptionHandler( NoDataException.class)
	@ResponseBody
	public JsonResult handleNodataException(NoDataException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}

}
