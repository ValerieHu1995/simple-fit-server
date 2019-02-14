package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationBuyerTrainerLesson;
import com.zju.cst.simplefitserver.model.vo.Curriculum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
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

  // 教练查看3天日程
  List<Curriculum> viewSchedule(@Param("trainerId") Integer trainerId,
                                @Param("startTime") String startTime,
                                @Param("endTime") String endTime);

  // 学生查看3天日程
  List<Curriculum> viewScheduleByBuyer(@Param("buyerId") Integer buyerId,
                                       @Param("startTime") String startTime,
                                       @Param("endTime") String endTime);

  // 商家查看3天日程
  List<Curriculum> viewScheduleBySeller(@Param("sellerId") Integer sellerId,
                                        @Param("startTime") String startTime,
                                        @Param("endTime") String endTime);
}