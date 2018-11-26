package com.zju.cst.simplefitserver.service.impl;

import com.zju.cst.simplefitserver.dao.mapper.RelationTrainerLessonMapper;
import com.zju.cst.simplefitserver.model.RelationTrainerLesson;
import com.zju.cst.simplefitserver.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService {

  @Autowired
  private RelationTrainerLessonMapper relationTrainerLessonMapper;

  /**
   * @param record
   * @return 教练开课
   */
  @Override
  public int insertSelective(RelationTrainerLesson record) {
    return this.relationTrainerLessonMapper.insertSelective(record);
  }

}
