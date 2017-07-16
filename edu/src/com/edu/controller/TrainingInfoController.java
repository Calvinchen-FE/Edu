package com.edu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.domain.Pxhd;
import com.edu.service.TrainingInfoServiceI;

@Controller
@RequestMapping("/trainingInfo")
public class TrainingInfoController {
	
	@Autowired
	TrainingInfoServiceI trainingInfoService;
	@ResponseBody
	@RequestMapping("/getAllPxhd.do")
	private List<Pxhd> getAllPxhd(){
		List<Pxhd> list = new ArrayList<Pxhd>();
		list = trainingInfoService.getAllPxhd();
		return list;
	}
}
