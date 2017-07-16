package com.edu.dao;

import java.util.List;

import com.edu.domain.Tzgg;
import com.edu.vo.AnnouncementVo;

public interface TzggMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tzgg record);

    int insertSelective(Tzgg record);

    Tzgg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tzgg record);

    int updateByPrimaryKeyWithBLOBs(Tzgg record);

    int updateByPrimaryKey(Tzgg record);
    
    List<Tzgg> getAllTzgg(AnnouncementVo announcementVo);
    int getAllTzggCount();  
}