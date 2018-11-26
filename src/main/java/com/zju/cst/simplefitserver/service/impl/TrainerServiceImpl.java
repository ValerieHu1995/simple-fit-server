package com.zju.cst.simplefitserver.service.impl;

import com.zju.cst.simplefitserver.dao.mapper.InfoDetailTrainerMapper;
import com.zju.cst.simplefitserver.dao.mapper.RelationTrainerLessonMapper;
import com.zju.cst.simplefitserver.model.InfoLesson;
import com.zju.cst.simplefitserver.model.RelationTrainerLesson;
import com.zju.cst.simplefitserver.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    return relationTrainerLessonMapper.insertSelective(record);
  }

  @Autowired
  private InfoDetailTrainerMapper infoDetailTrainerMapper;

  /**
   * @param trainerId
   * @return 教练能上的课程
   */
  @Override
  public List<InfoLesson> getTrainerCredential(Integer trainerId) {
    List<InfoLesson> list = infoDetailTrainerMapper.selectLessonByTrainerId(trainerId);
    return list;
  }

  /**
   * @param record
   * @return 教练修改课程
   */
  @Override
  public int modifySelective(RelationTrainerLesson record) {
    return relationTrainerLessonMapper.updateByPrimaryKeySelective(record);
  }

  @Override
  public int deleteLessonById(Integer lessonId) {
    return relationTrainerLessonMapper.deleteByPrimaryKey(lessonId);
  }

}
