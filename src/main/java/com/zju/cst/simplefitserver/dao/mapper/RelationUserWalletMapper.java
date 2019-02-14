package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.RelationUserWallet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RelationUserWalletMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(RelationUserWallet record);

  int insertSelective(RelationUserWallet record);

  RelationUserWallet selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RelationUserWallet record);

  int updateByPrimaryKey(RelationUserWallet record);

  // 商家获取今日买卡数
  List<Integer> getCardNumToday(@Param("walletId") Integer walletId, @Param("createTime") Integer createTime);

  // 商家获取今日买课数
  int getLessonNumToday(@Param("walletId") Integer walletId, @Param("createTime") Integer createTime);

  // 教练获取今日买卡数
  List<Integer> trainerGetCardNumToday(@Param("userId") Integer userId, @Param("createTime") Integer createTime);
}