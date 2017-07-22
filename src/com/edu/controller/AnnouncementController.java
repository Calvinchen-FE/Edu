package com.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.domain.Tzgg;
import com.edu.service.AnnouncementServiceI;
import com.edu.vo.AnnouncementVo;
import com.edu.vo.Pagination;

@RequestMapping("/announcement")
@Controller
public class AnnouncementController {
	
	@Autowired
	AnnouncementServiceI announcement;
	
	
	@RequestMapping("/announcementPage.do")
	private String announcementPage(){
		return "announcement";
	}
	@ResponseBody
	@RequestMapping(value="/getAllTzgg.do",method = RequestMethod.POST,consumes="application/json")
	private AnnouncementVo<Tzgg> getAllTzgg(@RequestBody Pagination pagination){

		AnnouncementVo<Tzgg> announcementVo=new AnnouncementVo<Tzgg>();
		announcementVo.setPage(pagination);
		List<Tzgg> list = announcement.getAllTzgg(announcementVo);
		announcementVo.setList(list);
		return announcementVo;
	}

}

