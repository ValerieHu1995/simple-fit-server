package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.InfoDetailBuyer;
import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.vo.Curriculum;
import com.zju.cst.simplefitserver.model.vo.RealLesson;
import com.zju.cst.simplefitserver.model.vo.ShopAndSeller;
import com.zju.cst.simplefitserver.model.vo.User;

import java.util.List;

public interface BuyerService {
  // 根据 userID 获取信息
  InfoDetailBuyer getBuyer(Integer userId);

  // 买卡
  int buyCard(Integer buyerId, Integer ownerUserId, String startTime, String endTime, Integer money);
  // 买课
  int buyLesson(Integer buyerId, Integer trainerLessonId, Integer money);
  // 获取全部教练
  List<InfoDetailTrainer> getAllTrainers();
  // 获取我上课的教练
  List<InfoDetailTrainer> getMyTrainers(Integer buyerId);

  // 获取全部商家
  List<ShopAndSeller> getAllCompanies();
  // 获取我上课的商家
  List<ShopAndSeller> getMyCompanies(Integer buyerId);

  // 获取全部课程
  List<RealLesson> getAllLessons();

  // 获取我的课程
  List<RealLesson> getMyLessons(Integer buyerId);

  // 获取买家的登录时信息
  User getInfo(String username);

  // 查看三天日程
  List<Curriculum> viewScheduleByBuyer(Integer buyerId, String startTime);
}
