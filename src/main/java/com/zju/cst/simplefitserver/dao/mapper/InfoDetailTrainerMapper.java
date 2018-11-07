package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoDetailTrainer;

public interface InfoDetailTrainerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoDetailTrainer record);

    int insertSelective(InfoDetailTrainer record);

    InfoDetailTrainer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoDetailTrainer record);

    int updateByPrimaryKey(InfoDetailTrainer record);
}