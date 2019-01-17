package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoLesson;

public interface InfoLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoLesson record);

    int insertSelective(InfoLesson record);

    InfoLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoLesson record);

    int updateByPrimaryKey(InfoLesson record);
}