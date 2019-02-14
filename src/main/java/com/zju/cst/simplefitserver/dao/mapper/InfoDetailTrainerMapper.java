package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoCredential;
import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.InfoLesson;
import com.zju.cst.simplefitserver.model.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InfoDetailTrainerMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(InfoDetailTrainer record);

  int insertSelective(InfoDetailTrainer record);

  InfoDetailTrainer selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(InfoDetailTrainer record);

  int updateByPrimaryKey(InfoDetailTrainer record);

  // 查询指定 trainer_id 的全部课程
  List<InfoLesson> selectLessonByTrainerId(Integer id);

  //查询制定教练的证书
  List<InfoCredential> selectCredentialByTrainerId(Integer id);

  // 获取全部的教练
  List<InfoDetailTrainer> getAllTrainers();

  // 获取我的教练
  List<InfoDetailTrainer> getMyTrainers(@Param("buyer_id") Integer buyerId);

  // 获取教练
  InfoDetailTrainer getTrainer(@Param("userId") Integer userId);

  // 获取教练登录信息
  User getInfo(@Param("username") String username);
}
