package com.edu.service;

import java.util.List;
import java.util.Set;

import com.edu.domain.Pxhd;
import com.edu.domain.Tzgg;
import com.edu.domain.User;
import com.edu.vo.AnnouncementVo;
import com.edu.vo.TrainingInfoAnnouncementVo;

public interface TrainingInfoServiceI {
	public List<Pxhd> getAllPxhd(TrainingInfoAnnouncementVo trainingInfoAnnouncementVo);
}
