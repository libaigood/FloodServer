package com.bzh.floodserver.controller;

import javax.annotation.Resource;

import com.bzh.floodserver.mapper.RainInfoDao;
import com.bzh.floodserver.model.sjappfu.Rainfalls_all;
import com.bzh.floodserver.service.NoDataException;
import com.bzh.floodserver.service.RainInfoService;
import com.bzh.floodserver.utils.JsonResult;
import com.bzh.floodserver.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 雨情信息
 */
@Controller
@RequestMapping("rainInfo")
public class RainInfoController {

	@Resource
	RainInfoService rainInfoService;

	@ResponseBody
	@GetMapping("sesese")
	public void show(String ss) {
		System.out.println("你好");
		List<String> list = new ArrayList<>();
		list.add("130408");
		list.add("140902");
		List list1 = stringList(ss);
		List<Rainfalls_all> rainfalls_alls = rainInfoService.select(list1);
		for (Rainfalls_all r : rainfalls_alls) {
			System.out.println(r.toString());
		}
	}

	//将字符串拆封，变成数组
	private List<String> stringList(String addvcd) {
		List<String> list = new ArrayList<>();
		if (addvcd != null && !addvcd.equals("")) {
			String[] sourceStrArray = addvcd.split(",");
			for (int i = 0; i < sourceStrArray.length; i++) {
				System.out.println(sourceStrArray[i]);
				list.add(sourceStrArray[i]);
			}
		}
		return list;
	}


	//降雨信息
	@ResponseBody
	@GetMapping("rainfalls_all")
	public ResultMap rainfalls_all(String stm, String etm, String addvcd) {
		List<Rainfalls_all> list = rainInfoService.rainfalls_all(stm, etm, addvcd);
		int gt50 = 0;
		double maxdrp = 0;
		String maxvg = "";
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).getDrp() >= 50) {
				gt50++;
			}
			if (list.get(i).getDrp() >= maxdrp) {
				maxdrp = list.get(i).getDrp();
				maxvg = list.get(i).getAdnm();
			}
		}
		String str = "共有" + list.size() + "个站发生降雨，其中" + gt50 + "个站超过50毫米。最大降雨量在" + maxvg + "，为" + maxdrp + "毫米。";
		return new ResultMap().success().message(str).data(list);
	}
	// 降雨单个站信息 条形统计图
	@ResponseBody
	@PostMapping("rainfalls_one")
	public Object rainfalls_one(String stcd, String stm, String etm, int timelength) {
		return new JsonResult(rainInfoService.rainfalls_one(stcd, stm, etm, timelength));
	}

	//雨强信息

	@ResponseBody
	@RequestMapping("rainIntensity_all")
	public Object rainIntensity_all(String stm, String etm, String addvcd) {
		return new JsonResult(rainInfoService.rainIntensity_all(stm, etm, addvcd));
	}

	@ResponseBody
	@RequestMapping("rainIntensity_one")
	public Object rainIntensity_one(String stcd, String stm, String etm, int timelength) {
		return new JsonResult(rainInfoService.rainIntensity_one(stcd, stm, etm, timelength));
	}


	//区域降雨统计
	@ResponseBody
	@RequestMapping("regionalRainfall")
	public Object regionalRainfall(String stm, String etm) {
		return new JsonResult(rainInfoService.regionalRainfall(stm, etm));
	}


	//雨量站详细信息
	@ResponseBody
	@RequestMapping("rain_detailed")
	public Object rain_detailed(String stcd) {
		return new JsonResult(rainInfoService.rain_detailed(stcd));
	}

	@ExceptionHandler(NoDataException.class)
	@ResponseBody
	public Object handleUserException(NoDataException e) {
		e.printStackTrace();
		return new JsonResult(2, e);
	}

}
