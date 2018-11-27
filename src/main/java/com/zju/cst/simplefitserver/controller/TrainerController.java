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


  // 查看课程
  // 教练查看全部课程


  // 取消课程


  // 确认课程


  // 查看课表


}
