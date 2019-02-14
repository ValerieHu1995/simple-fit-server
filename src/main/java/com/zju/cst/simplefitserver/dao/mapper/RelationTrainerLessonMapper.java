package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationTrainerLesson;
import com.zju.cst.simplefitserver.model.vo.RealLesson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RelationTrainerLessonMapper {
  int deleteByPrimaryKey(Integer id);

  // 教练开课
  int insert(RelationTrainerLesson record);

  int insertSelective(RelationTrainerLesson record);

  RelationTrainerLesson selectByPrimaryKey(Integer id);

  // 教练修改课程
  int updateByPrimaryKeySelective(RelationTrainerLesson record);

  int updateByPrimaryKey(RelationTrainerLesson record);

  // 根据教练获取课程
  List<RelationTrainerLesson> selectByTrainerId(Integer id);

  // 根据地点查询课程
  List<RelationTrainerLesson> selectByPlace(String place);

  // 获取全部课程
  List<RealLesson> getAllLessons();

  // 获取我的课程
  List<RealLesson> getMyLessons(@Param("buyer_id") Integer buyerId);
}