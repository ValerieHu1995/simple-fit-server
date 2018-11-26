package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationUserWallet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RelationUserWalletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationUserWallet record);

    int insertSelective(RelationUserWallet record);

    RelationUserWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationUserWallet record);

    int updateByPrimaryKey(RelationUserWallet record);
}