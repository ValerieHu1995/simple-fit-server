package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.model.InfoDetailBuyer;
import com.zju.cst.simplefitserver.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

  @Autowired
  BuyerService buyerService;

  // 获取 buyer_id
  @ResponseBody
  @RequestMapping(value = "/getBuyer", method = RequestMethod.POST)
  public ResponseInfo getBuyer(@RequestParam(value = "userId") Integer userId) {
    ResponseInfo responseInfo = new ResponseInfo();
    InfoDetailBuyer buyer = buyerService.getBuyer(userId);
    if (buyer != null) {
      responseInfo.setResObject(buyer);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 用户购卡
  @ResponseBody
  @RequestMapping(value = "/buyCard", method = RequestMethod.POST)
  public ResponseInfo buyCard(@RequestParam(value = "buyerId") Integer buyerId,
                              @RequestParam(value = "ownerUserId") Integer ownerUserId,
                              @RequestParam(value = "obtainTime") String obtainTime,
                              @RequestParam(value = "expireTime") String expireTime,
                              @RequestParam(value = "money") Integer money) {
    ResponseInfo responseInfo = new ResponseInfo();
    int re = buyerService.buyCard(buyerId, ownerUserId, obtainTime, expireTime, money);
    if (re > 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 用户购课
  @ResponseBody
  @RequestMapping(value = "/buyLesson", method = RequestMethod.POST)
  public ResponseInfo buyLesson(@RequestParam(value = "buyerId") Integer buyerId,
                                @RequestParam(value = "trainerLessonId") Integer trainerLessonId,
                                @RequestParam(value = "money") Integer money) {
    ResponseInfo responseInfo = new ResponseInfo();
    int re = buyerService.buyLesson(buyerId, trainerLessonId, money);
    if (re > 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 查看全部教练
  @ResponseBody
  @RequestMapping(value = "/allTrainers", method = RequestMethod.GET)
  public ResponseInfo getAllTrainers() {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.getAllTrainers();
    if (list.size() != 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 查看给我上课的教练
  @ResponseBody
  @RequestMapping(value = "/myTrainers", method = RequestMethod.POST)
  public ResponseInfo getMyTrainers(@RequestParam(value = "buyerId") Integer buyerId) {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.getMyTrainers(buyerId);
    if (list.size() != 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 查看全部商家
  @ResponseBody
  @RequestMapping(value = "/allCompanies", method = RequestMethod.GET)
  public ResponseInfo getAllCompanies() {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.getAllCompanies();
    if (list.size() != 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 查看我上课的商家
  @ResponseBody
  @RequestMapping(value = "/myCompanies", method = RequestMethod.POST)
  public ResponseInfo getMyCompanies(@RequestParam(value = "buyerId") Integer buyerId) {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.getMyCompanies(buyerId);
    if (list.size() != 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 查看全部课程
  @ResponseBody
  @RequestMapping(value = "/allLessons", method = RequestMethod.GET)
  public ResponseInfo getAllLessons() {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.getAllLessons();
    if (list.size() != 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 查看我上课的课程
  @ResponseBody
  @RequestMapping(value = "/myLessons", method = RequestMethod.POST)
  public ResponseInfo getMyLessons(@RequestParam(value = "buyerId") Integer buyerId) {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.getMyLessons(buyerId);
    if (list.size() != 0) {
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
    } else {
      responseInfo.setResCode("default");
      responseInfo.setResInfo("Error");
    }
    return responseInfo;
  }

  // 用户查看三天课程
  @ResponseBody
  @RequestMapping(value = "/viewSchedule", method = RequestMethod.POST)
  public ResponseInfo viewSchedule(@RequestParam(value = "buyerId") Integer buyerId, @RequestParam(value = "startTime") String startTime) {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = buyerService.viewScheduleByBuyer(buyerId, startTime);
    responseInfo.setResCode("200");
    responseInfo.setResInfo("Success");
    responseInfo.setResDataSet(list.toArray());
    return responseInfo;
  }

}
