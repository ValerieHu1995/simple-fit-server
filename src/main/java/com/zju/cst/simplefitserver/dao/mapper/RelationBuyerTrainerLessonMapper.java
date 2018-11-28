package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationBuyerTrainerLesson;

import java.util.List;

public interface RelationBuyerTrainerLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationBuyerTrainerLesson record);

    int insertSelective(RelationBuyerTrainerLesson record);

    RelationBuyerTrainerLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationBuyerTrainerLesson record);

    int updateByPrimaryKey(RelationBuyerTrainerLesson record);

    // 取消学生定下的课程
    int deleteByTimeAndTrainerLessonId(Integer trainerLessonId, String time);

    // 教练确定一节课结束
    int verifyBuyerLesson(Integer id);

    // 教练查看七天日程
    List<RelationBuyerTrainerLesson> viewSchedule(Integer trainerId, String startTime);
}