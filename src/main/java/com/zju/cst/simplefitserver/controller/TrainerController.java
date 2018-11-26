package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.model.RelationTrainerLesson;
import com.zju.cst.simplefitserver.service.TrainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainer")
@Slf4j
public class TrainerController {
  @Autowired
  TrainerService trainerService;

  /*
  *
  {
    "name": "这是一门不知道能不能开的游泳课",
    "trainerId": 1,
    "lessonId": 3,
    "shopId": 1,
    "capacity": 2,
    "frequency": 3,
    "time": 20181126,
  }
  *
  * */
  @RequestMapping(value = "/createlesson", method = RequestMethod.POST)
  public Object trainerCreateLesson(@RequestBody RelationTrainerLesson record) {
    record.setStatus(1);
    record.setType(0);
    // 返回的是修改sql的数量
    return trainerService.insertSelective(record);
  }

}
