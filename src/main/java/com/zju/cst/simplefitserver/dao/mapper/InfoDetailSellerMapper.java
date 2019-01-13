package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoDetailSeller;
import com.zju.cst.simplefitserver.model.vo.ShopAndSeller;
import com.zju.cst.simplefitserver.model.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoDetailSellerMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(InfoDetailSeller record);

  int insertSelective(InfoDetailSeller record);

  InfoDetailSeller selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(InfoDetailSeller record);

  int updateByPrimaryKey(InfoDetailSeller record);

  // 获取全部商家
  List<ShopAndSeller> getAllCompanies();

  // 获取我的商家
  List<ShopAndSeller> getMyCompanies(@Param("buyer_id") Integer buyerId);

  // 获取 seller 信息
  InfoDetailSeller getSeller(@Param("userId") Integer userId);

  // 获取商家登录信息
  User getInfo(@Param("username") String username);
}