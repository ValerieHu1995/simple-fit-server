package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationUserWallet;

public interface RelationUserWalletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationUserWallet record);

    int insertSelective(RelationUserWallet record);

    RelationUserWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationUserWallet record);

    int updateByPrimaryKey(RelationUserWallet record);
}