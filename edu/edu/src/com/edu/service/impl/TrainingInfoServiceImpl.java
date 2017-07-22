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
import com.edu.domain.Tzgg;
import com.edu.domain.User;
import com.edu.service.TrainingInfoServiceI;
import com.edu.service.UserServiceI;
import com.edu.vo.AnnouncementVo;
import com.edu.vo.Pagination;
import com.edu.vo.TrainingInfoAnnouncementVo;

@Service("TrainingInfoService")
public class TrainingInfoServiceImpl implements TrainingInfoServiceI{

	@Autowired
	private PxhdMapper pxhdMapper;

	public List<Pxhd> getAllPxhd(TrainingInfoAnnouncementVo trainingInfoAnnouncementVo){  
        if (trainingInfoAnnouncementVo.getPage() == null) {  
        	trainingInfoAnnouncementVo.setPage(new Pagination());  
        }  
        Integer rows = pxhdMapper.getAllPxhdCount(); 
        trainingInfoAnnouncementVo.getPage().setTotalCount(rows);  
        Pagination page = trainingInfoAnnouncementVo.getPage();  
        List<Pxhd> list = pxhdMapper.getAllPxhd(trainingInfoAnnouncementVo);
        return list;  
    }
	
}
