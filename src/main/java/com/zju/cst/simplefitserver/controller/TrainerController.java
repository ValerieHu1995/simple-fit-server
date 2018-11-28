package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.common.ResponseInfo;
import com.zju.cst.simplefitserver.model.RelationTrainerLesson;
import com.zju.cst.simplefitserver.service.TrainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
@Slf4j
public class TrainerController {
  @Autowired
  TrainerService trainerService;

  // 创建课程
  @ResponseBody
  @RequestMapping(value = "/createLesson", method = RequestMethod.POST)
  public Object trainerCreateLesson(@RequestBody RelationTrainerLesson record) {
    ResponseInfo responseInfo = new ResponseInfo();
    record.setStatus(1);
    record.setType(0);
    // 返回的是修改sql的数量
    trainerService.insertSelective(record);
    responseInfo.setResCode("200");
    responseInfo.setResInfo("Success");
    return responseInfo;
  }

  // 查看能创建的课程
  @ResponseBody
  @RequestMapping(value = "/getAllCanCreateLesson", method = RequestMethod.GET)
  public Object getAllCanCreateLesson(@RequestParam(value = "trainerId")Integer trainerId) {
    ResponseInfo responseInfo = new ResponseInfo();
    List list = trainerService.getTrainerCredential(trainerId);
    responseInfo.setResCode("200");
    responseInfo.setResInfo("Success");
    responseInfo.setResDataSet(list.toArray());
    return responseInfo;
  }

  // 修改创建的课程
  @ResponseBody
  @RequestMapping(value = "/modifyLesson", method = RequestMethod.POST)
  public Object modifyLesson(@RequestBody RelationTrainerLesson record) {
    ResponseInfo responseInfo = new ResponseInfo();
    if (record.getId() != null) {
      // 没有设置 id 就是无效课程
      trainerService.modifySelective(record);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      return responseInfo;
    }
    responseInfo.setResCode("default");
    responseInfo.setResInfo("Error");
    return responseInfo;
  }

  // 删除课程
  @ResponseBody
  @RequestMapping(value = "/deleteLesson", method = RequestMethod.POST)
  public Object deleteLessonById(@RequestParam(value = "deleteLessonId")Integer deleteLessonId) {
    ResponseInfo responseInfo = new ResponseInfo();
    trainerService.deleteLessonById(deleteLessonId);
    responseInfo.setResCode("200");
    responseInfo.setResInfo("Success");
    return responseInfo;
  }

  // 查找课程
  // 教练查找指定课程
  // 比如根据地点查询课程
  @ResponseBody
  @RequestMapping(value = "/selectLessonByPlace", method = RequestMethod.POST)
  public Object selectLessonByPlace(@RequestParam(value = "place")String place) {
    ResponseInfo responseInfo = new ResponseInfo();
    if (place != null) {
      List list = trainerService.selectLessonByPlace(place);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
      return responseInfo;
    }
    responseInfo.setResCode("default");
    responseInfo.setResInfo("Error");
    return responseInfo;
  }

  // 查看课程
  // 教练查看全部课程
  // 暂时返回指定教练的的课程信息
  @ResponseBody
  @RequestMapping(value = "/getAllLessonByTrainerId", method = RequestMethod.GET)
  public Object getAllLessonByTrainerId(@RequestParam(value = "trainerId")Integer trainerId) {
    ResponseInfo responseInfo = new ResponseInfo();
    if (trainerId != null) {
      List list = trainerService.getAllLessonByTrainerId(trainerId);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
      return responseInfo;
    }
    responseInfo.setResCode("default");
    responseInfo.setResInfo("Error");
    return responseInfo;
  }

  /**
   * @return
   * 理论上来讲事实应该是输入指定的日期，以及指定的时间点
   */
  // 取消课程
  // 教练取消课程
  @ResponseBody
  @RequestMapping(value = "/cancelBuyerLesson", method = RequestMethod.POST)
  public Object cancelLesson(@RequestParam(value = "time")String time, @RequestParam(value = "trainerLessonId")Integer trainerLessonId) {
    ResponseInfo responseInfo = new ResponseInfo();
    if (trainerLessonId != null) {
      // 删除了 re 条记录
      int re = trainerService.deleteBuyerLesson(trainerLessonId, time);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      return responseInfo;
    }
    responseInfo.setResCode("default");
    responseInfo.setResInfo("Error");
    return responseInfo;
  }

  // 确认课程
  // 教练确认一节课完成
  // 满足要求以后，学生课程自动结束
  @ResponseBody
  @RequestMapping(value = "/verifyBuyerLesson", method = RequestMethod.POST)
  public Object verifyBuyerLesson(@RequestParam(value = "relationBuyerTrainerLessonId")Integer id) {
    ResponseInfo responseInfo = new ResponseInfo();
    if (id != null) {
      trainerService.verifyBuyerLesson(id);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      return responseInfo;
    }
    responseInfo.setResCode("default");
    responseInfo.setResInfo("Error");
    return responseInfo;
  }

  // 查看课表
  // 教练查看7天课表
  /*
  需要一个起始时间
  以及一个教练 id
   */
  @ResponseBody
  @RequestMapping(value = "/viewSchedule", method = RequestMethod.POST)
  public Object viewSchedule(@RequestParam(value = "trainerId")Integer trainerId, @RequestParam(value = "startTime")String startTime) {
    ResponseInfo responseInfo = new ResponseInfo();
    if (trainerId != null) {
      List list = trainerService.viewSchedule(trainerId, startTime);
      responseInfo.setResCode("200");
      responseInfo.setResInfo("Success");
      responseInfo.setResDataSet(list.toArray());
      return responseInfo;
    }
    responseInfo.setResCode("default");
    responseInfo.setResInfo("Error");
    return responseInfo;
  }

}
