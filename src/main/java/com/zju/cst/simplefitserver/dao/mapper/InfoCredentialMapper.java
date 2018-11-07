package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoCredential;



public interface InfoCredentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoCredential record);

    int insertSelective(InfoCredential record);

    InfoCredential selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoCredential record);

    int updateByPrimaryKey(InfoCredential record);
}