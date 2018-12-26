package com.bzh.floodserver.controller;

import javax.annotation.Resource;

import com.bzh.floodserver.service.OtherService;
import com.bzh.floodserver.utils.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("OtherController")
public class OtherController {
	
	@Resource
    OtherService otherService;
	
	@ResponseBody
	@PostMapping("allStcds")
	public Object allStcds() {
		return new JsonResult(otherService.allStcds());
	}
	
	@ResponseBody
	@PostMapping("allAddvcds")
	public Object allAddvcds() {
		return new JsonResult(otherService.allAddvcds());
	}
}
