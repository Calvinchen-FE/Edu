package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.domain.Pxhd;
import com.edu.domain.Tzgg;
import com.edu.service.TrainingInfoServiceI;
import com.edu.vo.AnnouncementVo;
import com.edu.vo.Pagination;
import com.edu.vo.TrainingInfoAnnouncementVo;

@Controller
@RequestMapping("/trainingInfo")
public class TrainingInfoController {
	
	@Autowired
	TrainingInfoServiceI trainingInfo;
	@RequestMapping("/trainingInfoPage")
	private String trainingInfoPage(){
		return "trainingInfo";
	}
	@ResponseBody
	@RequestMapping(value="/getAllPxhd.do",method = RequestMethod.POST,consumes="application/json")
	private TrainingInfoAnnouncementVo<Pxhd> getAllPxhd(@RequestBody Pagination pagination){

		TrainingInfoAnnouncementVo<Pxhd> trainingInfoAnnouncementVo=new TrainingInfoAnnouncementVo<Pxhd>();
		trainingInfoAnnouncementVo.setPage(pagination);
		List<Pxhd> list = trainingInfo.getAllPxhd(trainingInfoAnnouncementVo);
		trainingInfoAnnouncementVo.setList(list);
		return trainingInfoAnnouncementVo;
	}
}
