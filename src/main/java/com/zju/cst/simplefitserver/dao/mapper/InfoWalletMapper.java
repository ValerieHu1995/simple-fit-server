package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoWallet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoWalletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoWallet record);

    int insertSelective(InfoWallet record);

    InfoWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoWallet record);

    int updateByPrimaryKey(InfoWallet record);
}