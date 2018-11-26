package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationTrainerLesson;
import org.springframework.stereotype.Component;

public interface RelationTrainerLessonMapper {
    int deleteByPrimaryKey(Integer id);

    // 教练开课
    int insert(RelationTrainerLesson record);

    int insertSelective(RelationTrainerLesson record);

    RelationTrainerLesson selectByPrimaryKey(Integer id);

    // 教练修改课程
    int updateByPrimaryKeySelective(RelationTrainerLesson record);

    int updateByPrimaryKey(RelationTrainerLesson record);
}