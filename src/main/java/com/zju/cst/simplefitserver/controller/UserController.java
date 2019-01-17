package com.zju.cst.simplefitserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.exception.UnAuthenticationException;
import com.zju.cst.simplefitserver.model.vo.User;
import com.zju.cst.simplefitserver.service.BuyerService;
import com.zju.cst.simplefitserver.service.CompanyService;
import com.zju.cst.simplefitserver.service.TrainerService;
import com.zju.cst.simplefitserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

  @Autowired
  UserService userService;

  @Autowired
  CompanyService companyService;

  @Autowired
  BuyerService buyerService;

  @Autowired
  TrainerService trainerService;

  @RequestMapping(value = "/unlogin", method = RequestMethod.GET)
  public Object unloginError() {
    throw new UnAuthenticationException();
  }

  @RequestMapping(value = "/{username}/login", method = RequestMethod.POST)
  public Object userLogin(@PathVariable(value = "username") String name,
                          @RequestParam(value = "password") String password,
                          @RequestParam(value = "type") Integer type) {

    ResponseInfo responseInfo = new ResponseInfo();
    Subject subject = SecurityUtils.getSubject();

    UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name, password);
    try {

      subject.login(usernamePasswordToken);

    } catch (UnknownAccountException ue) {

      responseInfo.setResCode("000001");
      responseInfo.setResInfo(" Unknow Username ");
      return responseInfo;

    } catch (IncorrectCredentialsException ie) {

      log.info("User login fail : username = {} , password = {} ", name, password);
      responseInfo.setResCode("000002");
      responseInfo.setResInfo(" Incorrect Password ");
      return responseInfo;

    }
    log.info("User login success : username = {} ", name);
    // 到这里说明成功
    // 重定向到 info
    ModelAndView mv = new ModelAndView("forward:/user/" + name + "/info?type=" + type);
    return mv;

//    responseInfo.setResCode("000000");
//    responseInfo.setResInfo(" Login Success ");
//
//    return responseInfo;

  }

  @RequestMapping(value = "/{username}/info")
  public ResponseInfo getUserInfo(@PathVariable("username") String name, @RequestParam("type") Integer type) {

    ResponseInfo responseInfo = new ResponseInfo();
    Subject currentUser = SecurityUtils.getSubject();
    String currentUserName = (String) currentUser.getPrincipal();

    if (!("" + name).equals(currentUserName)) {

      throw new UnAuthenticationException();
    }

    log.info("User get info : username = {}  ", name);
    User infoUser = null;
    if (type == 0) {
      // 普通用户
      infoUser = buyerService.getInfo(name);
    } else if (type == 1) {
      // 商家
      infoUser = companyService.getInfo(name);
    } else if (type == 2) {
      // 教练
      infoUser = trainerService.getInfo(name);
    } else {
      // 管理员
    }

    if (infoUser != null) {
      responseInfo.setResCode("200");
      responseInfo.setResObject(infoUser);
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public ResponseInfo registerUser(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "password") String password,
                                   @RequestParam(value = "type") Integer type) {
    ResponseInfo responseInfo = new ResponseInfo();
    userService.registerByType(username, password, type);
    responseInfo.setResCode("200");
    return responseInfo;
  }

  @ResponseBody
  @RequestMapping(value = "/getIndex", method = RequestMethod.POST)
  public ResponseInfo getIndex(@RequestParam("userId") Integer userId, @RequestParam("type") Integer type, @RequestParam("createTime") Integer createTime) {
    ResponseInfo res = new ResponseInfo();
    List<Integer> cardNumToday;
    if (type == 0) {
      // 普通用户
    } else if (type == 1) {
      // 商家
      // 今日买课、今日买卡
      // 显示的今日买课是自己店里开的课
      cardNumToday = companyService.getCardNumToday(userId, createTime);
      JSONObject outData = new JSONObject();
      outData.put("cardToday", cardNumToday.get(0));
      outData.put("lessonToday", cardNumToday.get(1));
      res.setResObject(outData);
    } else if (type == 2) {
      // 教练
      // 今日买课——显示的是今日自己开的课买的人数
      // 今日买卡——显示的是自己教的店里今日开卡的人数
      cardNumToday = trainerService.getCardNumToday(userId, createTime);
      JSONObject outData = new JSONObject();
      outData.put("cardToday", cardNumToday.get(0));
      outData.put("lessonToday", cardNumToday.get(1));
      res.setResObject(outData);
    } else if (type == 3) {
      // 管理
      // 先不写了
    }
    res.setResCode("200");
    return res;
  }

}
