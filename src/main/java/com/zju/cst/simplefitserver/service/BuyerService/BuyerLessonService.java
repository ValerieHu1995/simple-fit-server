package com.zju.cst.simplefitserver.service.BuyerService;

import com.zju.cst.simplefitserver.model.InfoLesson;

import java.util.List;

public interface BuyerLessonService {

//     查看所有可选的课程--私课
     public List<InfoLesson> showAllPrivateLessons();

//     查看所有可选的课程--团课
     public List<InfoLesson> showAllPublicLessons();

//     查看所有已买的课程
     public  List<InfoLesson> showAllLessons();

//     查看正在上课的课程
     public  List<InfoLesson> showAllCurrentLessons();

//     查看上过的课程
     public  List<InfoLesson> showAllHistoryLessons();

//     操作：购买某一个课程，这个应该在BuyerTrainerLessonService里吧
  //   public InfoLesson buyLession(InfoLesson infoLesson);

}
