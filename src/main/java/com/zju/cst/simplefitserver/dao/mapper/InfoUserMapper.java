package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoUser;

public interface InfoUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoUser record);

    int insertSelective(InfoUser record);

    InfoUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoUser record);

    int updateByPrimaryKey(InfoUser record);

    // add
    InfoUser selectByUsername(String username);
}