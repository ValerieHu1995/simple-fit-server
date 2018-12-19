package com.zju.cst.simplefitserver.service.impl;

import com.zju.cst.simplefitserver.dao.mapper.*;
import com.zju.cst.simplefitserver.model.*;
import com.zju.cst.simplefitserver.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

  @Autowired
  private RelationTrainerLessonMapper relationTrainerLessonMapper;

  @Autowired
  private RelationTrainerCredentialMapper relationTrainerCredentialMapper;

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

  /**
   * @param trainerId
   * @return 返回指定教练的全部课程
   */
  @Override
  public List<RelationTrainerLesson> getAllLessonByTrainerId(Integer trainerId) {
    List<RelationTrainerLesson> list = relationTrainerLessonMapper.selectByTrainerId(trainerId);
    return list;
  }

  /**
   * @param place
   * @return 根据地点查询课程
   */
  @Override
  public List<RelationTrainerLesson> selectLessonByPlace(String place) {
    List<RelationTrainerLesson> list = relationTrainerLessonMapper.selectByPlace(place);
    return list;
  }

  @Autowired
  RelationBuyerTrainerLessonMapper relationBuyerTrainerLessonMapper;

  /**
   * @param id
   * @param time
   * @return 取消学生定下的课程
   * 输入的时间格式是
   */
  @Override
  public int deleteBuyerLesson(Integer id, String time) {
    return relationBuyerTrainerLessonMapper.deleteByTimeAndTrainerLessonId(id, time);
  }

  /**
   * @param id
   * @return 教练确定一节课结束
   */
  @Override
  public int verifyBuyerLesson(Integer id) {
    return relationBuyerTrainerLessonMapper.verifyBuyerLesson(id);
  }

  /**
   * @param trainerId
   * @param startTime
   * @return 教练查看 7 天日程
   */
  @Override
  public List<RelationBuyerTrainerLesson> viewSchedule(Integer trainerId, String startTime) {
    List<RelationBuyerTrainerLesson> list = relationBuyerTrainerLessonMapper.viewSchedule(trainerId, startTime);
    return list;
  }

  /**
   *
   * @param relationTrainerCredential
   * @return 教练上传证书
   */
  @Override
  public int insertCredential(RelationTrainerCredential relationTrainerCredential) {
    return relationTrainerCredentialMapper.insert(relationTrainerCredential);
  }

  /**
   *
   * @param relationTrainerCredential
   * @return 教练更新证书
   */
  @Override
  public int updateCredential(RelationTrainerCredential relationTrainerCredential) {
    return relationTrainerCredentialMapper.updateByPrimaryKeySelective(relationTrainerCredential);
  }

  /**
   *
   * @param trainerId
   * @return 教练查看所拥有证书
   */
  @Override
  public List<InfoCredential> viewCredential(Integer trainerId) {
    List<InfoCredential> list = infoDetailTrainerMapper.selectCredentialByTrainerId(trainerId);
    return list;
  }

  /**
   *
   * @param trainerId
   * @param credentialId
   * @return 教练根据证书ID和教练ID删除证书
   */
  @Override
  public int trainerDeleteCredential(Integer trainerId, Integer credentialId) {
    return relationTrainerCredentialMapper.deleteByTrainerIdAndCredentialId(trainerId,credentialId);
  }
}

