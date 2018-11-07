package com.zju.cst.simplefitserver.service.Impl;

import com.zju.cst.simplefitserver.dao.mapper.InfoUserMapper;
import com.zju.cst.simplefitserver.model.InfoUser;
import com.zju.cst.simplefitserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private InfoUserMapper infoUserMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertUser(InfoUser user) throws Exception {
        infoUserMapper.insertSelective(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(InfoUser user) {
        infoUserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(Integer id) {
        infoUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public InfoUser queryUserById(Integer id) {
        infoUserMapper.selectByPrimaryKey(id);
        return null;
    }

}
