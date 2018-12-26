package com.bzh.floodserver.controller;

import javax.annotation.Resource;

import com.bzh.floodserver.model.sjappfu.WaterInfo_reservoir_all;
import com.bzh.floodserver.model.sjappfu.WaterInfo_river_all;
import com.bzh.floodserver.service.NoDataException;
import com.bzh.floodserver.service.WaterInfoService;
import com.bzh.floodserver.utils.JsonResult;
import com.bzh.floodserver.utils.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * 水情信息
 * */
@Controller
@RequestMapping("waterInfo")
public class WaterInfoController {
	
	@Resource
    WaterInfoService waterInfoService;
	
	//河道信息
	
	@ResponseBody
	@RequestMapping("river_all")
	public ResultMap river_all(String stm, String etm, String addvcd){
		List<WaterInfo_river_all> list = waterInfoService.river_all(stm, etm, addvcd);
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy年MM月dd日 HH:mm" );
		int num = 0;
		for(int i = 0; i < list.size(); i++) {
			WaterInfo_river_all wra = list.get(i);
			Date tm = wra.getTm();
			String sdftm = sdf.format(tm);
			wra.setTtt(sdftm.substring(5));
			double cjjse = Double.parseDouble(new DecimalFormat("#0.00").format(wra.getZ()-wra.getWrz()));
			wra.setCjjsw(cjjse);
			if(cjjse > 0) {
				num++;
			}
		}
		String str = "共有"+list.size()+"个河道站，超警戒"+num+"个站。";
		return new ResultMap().success().message(str).data(list);
	}
	
	@ResponseBody
	@RequestMapping("river_one")
	public Object river_one(String stcd, String stm, String etm){
		
		return new JsonResult(waterInfoService.river_one(stcd, stm, etm));
	}
	
	@ResponseBody
	@RequestMapping("river_detailed")
	public Object river_detailed(String stcd){
		
		return new JsonResult(waterInfoService.river_detailed(stcd));
	}
	
	//水库信息
	
	@ResponseBody
	@RequestMapping("reservoir_all")
	public ResultMap reservoir_all( String stm, String etm, String addvcd){
		List<WaterInfo_reservoir_all> list = waterInfoService.reservoir_all(stm, etm, addvcd);
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy年MM月dd日 HH:mm" );
		int num = 0;
		for (WaterInfo_reservoir_all wra : list) {
			wra.setCxxsw(Double.parseDouble(new DecimalFormat("#0.00").format(wra.getRz() - wra.getFsltdz())));
			Date tm = wra.getTm();
			wra.setTtt(sdf.format(tm).substring(5));
			if (wra.getRz() - wra.getFsltdz() > 0) {
				num++;
			}
		}
		String str = "共有"+list.size()+"个站，超汛限水位"+num+"个。";
		return new ResultMap().success().message(str).data(list);
	}
	
	@ResponseBody
	@RequestMapping("reservoir_one")
	public Object reservoir_one( String stcd, String stm, String etm){
		
		return new JsonResult(waterInfoService.reservoir_one(stcd, stm, etm));
	}
	
	@ResponseBody
	@RequestMapping("reservoir_detailed")
	public Object reservoir_detailed(String stcd){
		
		return new JsonResult(waterInfoService.reservoir_detailed(stcd));
	}
	
	@ExceptionHandler( NoDataException.class)
	@ResponseBody
	public Object handleUserException(NoDataException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}
}

