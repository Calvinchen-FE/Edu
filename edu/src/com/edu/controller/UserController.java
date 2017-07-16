package com.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.domain.User;
import com.edu.service.UserServiceI;

@Controller
@RequestMapping("/user")
public class UserController {
	Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserServiceI userService;
	
	@RequestMapping("/getAllUser.do")
	public String getAllUser(HttpServletRequest req){
		logger.debug("��ʼ���ʡ�����������������");
		List<User> lstUsers = userService.getAllUser();
		logger.info("�õ�User�б�����������������");
		req.setAttribute("lstUsers", lstUsers);
		logger.error("log error������ԡ�������������");
		return "MyJsp";
	}
	
}
