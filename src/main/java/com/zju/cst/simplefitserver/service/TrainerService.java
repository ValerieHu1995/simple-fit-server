package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.*;

import java.util.List;

// 教练端
public interface TrainerService {

  // 教练开课
  int insertSelective(RelationTrainerLesson record);

  // 返回教练可以上的课程
  List<InfoLesson> getTrainerCredential(Integer trainerId);

  // 教练修改课程
  int modifySelective(RelationTrainerLesson record);

  // 删除课程
  int deleteLessonById(Integer lessonId);

  // 查看指定教练的全部课程
  List<RelationTrainerLesson> getAllLessonByTrainerId(Integer trainerId);

  // 根据地点查询课程
  List<RelationTrainerLesson> selectLessonByPlace(String place);

  // 取消学生定下的课程
  // 需要传入课程 id 以及需要删除的时间点
  int deleteBuyerLesson(Integer id, String time);

  // 教练确认课程完成
  int verifyBuyerLesson(Integer id);

  // 教练查看 7 天日程
  List<RelationBuyerTrainerLesson> viewSchedule(Integer trainerId, String startTime);

  //教练上传证书
  int insertCredential(RelationTrainerCredential relationTrainerCredential);

  //教练更新证书
  int updateCredential(RelationTrainerCredential relationTrainerCredential);

  //教练查看证书
  List<InfoCredential> viewCredential(Integer trainerId);

  int trainerDeleteCredential(Integer trainerId, Integer credentialId);
}
