package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationBuyerLesson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RelationBuyerLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationBuyerLesson record);

    int insertSelective(RelationBuyerLesson record);

    RelationBuyerLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationBuyerLesson record);

    int updateByPrimaryKey(RelationBuyerLesson record);
}