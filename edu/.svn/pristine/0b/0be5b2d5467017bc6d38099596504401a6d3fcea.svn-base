package com.edu.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.edu.dao.PermissionMapper;
import com.edu.dao.PxhdMapper;
import com.edu.dao.UserMapper;
import com.edu.domain.Pxhd;
import com.edu.domain.User;
import com.edu.service.TrainingInfoServiceI;
import com.edu.service.UserServiceI;

@Service("TrainingInfoService")
public class TrainingInfoServiceImpl implements TrainingInfoServiceI{

	@Autowired
	private PxhdMapper pxhdMapper;
	@Override
	public List<Pxhd> getAllPxhd() {
		// TODO Auto-generated method stub
		return pxhdMapper.getAllPxhd();
	}
	
}
