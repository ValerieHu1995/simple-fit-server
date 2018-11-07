package com.zju.cst.simplefitserver.controller;

import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.InfoLesson;
import com.zju.cst.simplefitserver.model.InfoShop;

import java.util.List;

public class BuyerLessonController {
    //    查看某个教练的所有课程--问题：显示所有课程还是只显示该教练的私课,我支持显示所有课程
    public List<InfoLesson> showAllLessonsByTrainer(InfoDetailTrainer trainer){
        return  null;
    }

    //   操作： 选择某一个教练的某一个课程并购买，并返回该课程
    public InfoLesson buyOneLesson(InfoDetailTrainer trainer,InfoLesson lesson){
        return null;
    }

//    选择某一个课程的某一个时间段进行选课
    public void selectOneLessonByTime(String time){

    }

    //    按照课程地点进行选课
    public void selectOneLessonByPlace(InfoShop shop){

    }

    //     查看本课程剩余次数
    public Integer showRemainNum(InfoLesson lesson){
        return null;
    }

    //     通过课程ID查看本课程剩余次数
    public Integer showRemainNum(Integer id){
        return null;
    }

    //评价打分
    public Integer score(){
        return 0;
    }

    //确认课程结束
    public void confirmLesson(InfoLesson lesson){

    }
}
