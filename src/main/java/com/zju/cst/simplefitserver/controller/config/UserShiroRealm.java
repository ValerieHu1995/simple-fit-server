package com.zju.cst.simplefitserver.controller.config;

import com.zju.cst.simplefitserver.model.InfoUser;
import com.zju.cst.simplefitserver.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class UserShiroRealm extends AuthorizingRealm {

    @Autowired
    @Lazy
    private UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        System.out.println("执行授权逻辑");

        return null;

    }

    //认证 包括登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("执行认证逻辑");

        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;

        String username = token.getUsername();

        InfoUser infoUser = userService.getUserInfoByName(username);


        if(infoUser==null){
            return null;
        }

        return new SimpleAuthenticationInfo(username,infoUser.getPassword(),"");
    }
}
