package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoUser;

public interface InfoUserMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(InfoUser record);

  int insertSelective(InfoUser record);

  InfoUser selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(InfoUser record);

  int updateByPrimaryKey(InfoUser record);

  // 根据用户名获取用户信息
  InfoUser selectByUsername(String username);

  // 注册用户
  int registerByType(String username, String password, int type);

}