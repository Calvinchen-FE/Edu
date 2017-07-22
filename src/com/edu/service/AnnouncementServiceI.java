package com.edu.service;

import java.util.List;

import com.edu.domain.Tzgg;
import com.edu.vo.AnnouncementVo;

public interface AnnouncementServiceI {
	public List<Tzgg> getAllTzgg(AnnouncementVo announcementVo);
	
}
