package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationTrainerCredential;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RelationTrainerCredentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationTrainerCredential record);

    int insertSelective(RelationTrainerCredential record);

    RelationTrainerCredential selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationTrainerCredential record);

    int updateByPrimaryKey(RelationTrainerCredential record);

    int deleteByTrainerIdAndCredentialId(@Param("trainerId") Integer trainerId, @Param("credentialId") Integer credentialId);

}
