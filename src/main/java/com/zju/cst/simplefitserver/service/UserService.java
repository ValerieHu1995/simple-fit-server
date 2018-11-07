package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.model.InfoUser;
import org.springframework.stereotype.Service;

public interface UserService {


    public InfoUser getUserInfoByName(String name);

    int insertSelective(InfoUser record);

    int updateByPrimaryKeySelective(InfoUser record);

}
