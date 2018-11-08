package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationTrainerLesson;

public interface RelationTrainerLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationTrainerLesson record);

    int insertSelective(RelationTrainerLesson record);

    RelationTrainerLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationTrainerLesson record);

    int updateByPrimaryKey(RelationTrainerLesson record);
}