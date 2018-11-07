package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.exception.UnAuthenticationException;
import com.zju.cst.simplefitserver.model.InfoUser;
import com.zju.cst.simplefitserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/unlogin")
    public Object unloginError(){
        throw new UnAuthenticationException();
    }

    @RequestMapping("/{username}/login")
    public Object userLogin(@PathVariable(value = "username")String name, @RequestParam(value = "password")String password){

        ResponseInfo responseInfo = new ResponseInfo();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name,password);
        try{

            subject.login(usernamePasswordToken);

        }catch (UnknownAccountException ue){

            responseInfo.setResCode("000001");
            responseInfo.setResInfo(" Unknow Username ");
            return responseInfo;

        }catch (IncorrectCredentialsException ie){

            log.info("User login fail : username = {} , password = {} ",name,password);
            responseInfo.setResCode("000002");
            responseInfo.setResInfo(" Incorrect Password ");
            return responseInfo;

        }

        log.info("User login success : username = {} ",name);
        responseInfo.setResCode("000000");
        responseInfo.setResInfo(" Login Success ");

        return responseInfo;

    }

    @RequestMapping("/{username}/info")
    public Object getUserInfo(@PathVariable("username")String name){

        ResponseInfo responseInfo = new ResponseInfo();
        Subject currentUser = SecurityUtils.getSubject();
        String currentUserName = (String)currentUser.getPrincipal();

        if(!(""+name).equals(currentUserName)){

            throw new UnAuthenticationException();
        }

        log.info("User get info : username = {}  ",name);

        InfoUser infoUser = this.userService.getUserInfoByName(name);

        responseInfo.setResCode("000000");
        responseInfo.setResInfo("return user info");
        responseInfo.setResObject(infoUser);

        return responseInfo;
    }

}
