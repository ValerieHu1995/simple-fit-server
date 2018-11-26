package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.InfoUser;

public interface UserService {

    InfoUser getUserInfoByName(String name);

    int insertSelective(InfoUser record);

    int updateByPrimaryKeySelective(InfoUser record);

}
