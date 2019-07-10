package com.xxy.samrt_house.controller;

import com.xxy.samrt_house.VO.ResponseVO;
import com.xxy.samrt_house.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiongxiaoyu
 * Data:2019/7/10
 * Des:
 */

@Controller
public class EntryEndPoint {

	@Autowired
	EntryService entryService;

	@GetMapping("/")
	public String page(){
		return "/echarts_page";
	}

	@ResponseBody
	@GetMapping("/getInfo")
	public ResponseVO getInfo(){
		return entryService.infoBack();
	}

}
