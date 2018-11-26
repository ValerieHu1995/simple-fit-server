package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.InfoLesson;

import java.util.List;

public interface InfoDetailTrainerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoDetailTrainer record);

    int insertSelective(InfoDetailTrainer record);

    InfoDetailTrainer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoDetailTrainer record);

    int updateByPrimaryKey(InfoDetailTrainer record);

    // 查询指定 trainer_id 的全部课程
    List<InfoLesson> selectLessonByTrainerId(Integer id);
}
