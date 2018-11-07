package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoUser;

import java.util.List;

public interface InfoUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoUser record);

    int insertSelective(InfoUser record);

    InfoUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoUser record);

    int updateByPrimaryKey(InfoUser record);

//    List<InfoUser> selectAll(); 显示所有用户信息
    InfoUser selectByUsername(String username);
}