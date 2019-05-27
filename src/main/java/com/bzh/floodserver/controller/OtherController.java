package com.bzh.floodserver.controller;

import com.bzh.floodserver.service.OtherService;
import com.bzh.floodserver.utils.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("server/OtherController")
public class OtherController {
	
	@Resource
    OtherService otherService;

	@PostMapping("allStcds")
	public Object allStcds() {
		return new JsonResult(otherService.allStcds());
	}
	

	@GetMapping("allAddvcds")
	public Object allAddvcds() {
		return new JsonResult(otherService.allAddvcds());
	}
}
