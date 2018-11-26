package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.InfoLesson;
import com.zju.cst.simplefitserver.model.RelationTrainerLesson;

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

}
