package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoDetailBuyer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoDetailBuyerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoDetailBuyer record);

    int insertSelective(InfoDetailBuyer record);

    InfoDetailBuyer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoDetailBuyer record);

    int updateByPrimaryKey(InfoDetailBuyer record);
}