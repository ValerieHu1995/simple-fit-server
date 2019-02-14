package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoShop;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoShop record);

    int insertSelective(InfoShop record);

    InfoShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoShop record);

    int updateByPrimaryKey(InfoShop record);
}