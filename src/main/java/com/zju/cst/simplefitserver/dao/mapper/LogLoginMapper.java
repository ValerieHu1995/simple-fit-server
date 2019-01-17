package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.LogLogin;
import org.apache.ibatis.annotations.Mapper;

public interface LogLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogLogin record);

    int insertSelective(LogLogin record);

    LogLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogLogin record);

    int updateByPrimaryKey(LogLogin record);
}