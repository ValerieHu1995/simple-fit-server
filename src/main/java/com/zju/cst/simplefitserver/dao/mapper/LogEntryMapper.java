package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.LogEntry;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogEntryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogEntry record);

    int insertSelective(LogEntry record);

    LogEntry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogEntry record);

    int updateByPrimaryKey(LogEntry record);
}