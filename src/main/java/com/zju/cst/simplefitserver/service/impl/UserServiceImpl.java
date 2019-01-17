package com.zju.cst.simplefitserver.service.impl;

import com.zju.cst.simplefitserver.dao.mapper.InfoUserMapper;
import com.zju.cst.simplefitserver.model.InfoUser;
import com.zju.cst.simplefitserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private InfoUserMapper infoUserMapper;

    /*
          cacheNames: 缓存名，用于管理
          key:        缓存数据使用的key   默认是参数的值
          keyGenerator: key的生成器，和上面的key参数只能用一个
          cacheManager: 缓存管理器
          condition:    判断条件，符合条件的情况下才缓存
          unless:       与confition相反，
          sync:         是否使用异步模式

    */

  @Override
  @Cacheable(cacheNames = "GetUserInfoByName", keyGenerator = "MethodNameAndArgsKey", unless = "#result==null")
  public InfoUser getUserInfoByName(String name) {
    return this.infoUserMapper.selectByUsername(name);
  }

  @Override
  public int insertSelective(InfoUser record) {
    return this.infoUserMapper.insertSelective(record);
  }

  @Override
  public int updateByPrimaryKeySelective(InfoUser record) {
    return this.infoUserMapper.updateByPrimaryKeySelective(record);
  }

  @Override
  public int registerByType(String username, String password, int type) {
    return infoUserMapper.registerByType(username, password, type);
  }
}
