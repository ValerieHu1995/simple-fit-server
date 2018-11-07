package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.InfoUser;

import java.util.List;

public interface UserService {
    public void insertUser(InfoUser user) throws Exception;

    public void updateUser(InfoUser user);

    public void deleteUser(Integer id);

    public InfoUser queryUserById(Integer userId);

}
