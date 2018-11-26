package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationBuyerTrainerLesson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RelationBuyerTrainerLessonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationBuyerTrainerLesson record);

    int insertSelective(RelationBuyerTrainerLesson record);

    RelationBuyerTrainerLesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationBuyerTrainerLesson record);

    int updateByPrimaryKey(RelationBuyerTrainerLesson record);
}