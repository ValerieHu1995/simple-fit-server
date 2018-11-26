package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.RelationTrainerLesson;

// 教练端
public interface TrainerService {

  // 教练开课
  int insertSelective(RelationTrainerLesson record);

}
