package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoDetailSeller;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoDetailSellerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoDetailSeller record);

    int insertSelective(InfoDetailSeller record);

    InfoDetailSeller selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoDetailSeller record);

    int updateByPrimaryKey(InfoDetailSeller record);
}