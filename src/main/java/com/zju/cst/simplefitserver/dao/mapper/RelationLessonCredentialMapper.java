package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationLessonCredential;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RelationLessonCredentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationLessonCredential record);

    int insertSelective(RelationLessonCredential record);

    RelationLessonCredential selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationLessonCredential record);

    int updateByPrimaryKey(RelationLessonCredential record);
}