package com.zju.cst.simplefitserver.service.BuyerService;

import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.InfoLesson;
import com.zju.cst.simplefitserver.model.InfoShop;

import java.util.List;

public interface BuyerTrainerLessonService {
//    查看某个教练的所有课程--问题：显示所有课程还是只显示该教练的私课,我支持显示所有课程
    public List<InfoLesson> showAllLessonsByTrainer(InfoDetailTrainer trainer);

//   操作： 选择某一个教练的某一个课程并购买，并返回该课程
    public InfoLesson buyOneLesson(InfoDetailTrainer trainer,InfoLesson lesson);

//    选择某一个课程的某一个时间段进行上课
    public void selectOneLessonByTime(String time);

//    按照课程地点进行选课
      public void selectOneLessonByPlace(InfoShop shop);

    //     查看本课程剩余次数
    public Integer showRemainNum(InfoLesson lesson);

//     通过课程ID查看本课程剩余次数
    public Integer showRemainNum(Integer id);

}
