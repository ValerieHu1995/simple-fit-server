package com.zju.cst.simplefitserver.service.impl;

import com.zju.cst.simplefitserver.dao.mapper.*;
import com.zju.cst.simplefitserver.model.InfoDetailBuyer;
import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.vo.Curriculum;
import com.zju.cst.simplefitserver.model.vo.RealLesson;
import com.zju.cst.simplefitserver.model.vo.ShopAndSeller;
import com.zju.cst.simplefitserver.model.vo.User;
import com.zju.cst.simplefitserver.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {

  @Autowired
  InfoDetailBuyerMapper infoDetailBuyerMapper;

  // 根据 userId 获取 buyerId
  @Override
  public InfoDetailBuyer getBuyer(Integer userId) {
    return infoDetailBuyerMapper.getBuyer(userId);
  }

  // 用户买卡
  @Override
  public int buyCard(Integer buyerId, Integer ownerUserId, String startTime, String endTime, Integer money) {
    // 获取当前时间
    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    String now = df.format(date);
    return infoDetailBuyerMapper.buyCard(buyerId, ownerUserId, startTime, endTime, Integer.valueOf(now), money);
  }

  // 用户买课
  @Override
  public int buyLesson(Integer buyerId, Integer trainerLessonId, Integer money) {
    // 获取当前时间
    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    String now = df.format(date);
    return infoDetailBuyerMapper.buyLesson(buyerId, money, Integer.valueOf(now), trainerLessonId);
  }

  @Autowired
  InfoDetailTrainerMapper infoDetailTrainerMapper;

  // 获取全部的教练
  @Override
  public List<InfoDetailTrainer> getAllTrainers() {
    return infoDetailTrainerMapper.getAllTrainers();
  }

  // 获取我的教练
  @Override
  public List<InfoDetailTrainer> getMyTrainers(Integer buyerId) {
    return infoDetailTrainerMapper.getMyTrainers(buyerId);
  }

  @Autowired
  InfoDetailSellerMapper infoDetailSellerMapper;

  // 获取全部的商家
  @Override
  public List<ShopAndSeller> getAllCompanies() {
    return infoDetailSellerMapper.getAllCompanies();
  }

  // 获取我的商家
  @Override
  public List<ShopAndSeller> getMyCompanies(Integer buyerId) {
    return infoDetailSellerMapper.getMyCompanies(buyerId);
  }

  @Autowired
  RelationTrainerLessonMapper relationTrainerLessonMapper;

  // 获取全部课程
  @Override
  public List<RealLesson> getAllLessons() {
    return relationTrainerLessonMapper.getAllLessons();
  }

  // 获取我的课程
  @Override
  public List<RealLesson> getMyLessons(Integer buyerId) {
    return relationTrainerLessonMapper.getMyLessons(buyerId);
  }

  // 获取用户的登录时信息
  @Override
  public User getInfo(String username) {
    return infoDetailBuyerMapper.getInfo(username);
  }

  @Autowired
  RelationBuyerTrainerLessonMapper relationBuyerTrainerLessonMapper;

  // 获取学员三天课表
  @Override
  public List<Curriculum> viewScheduleByBuyer(Integer buyerId, String startTime) {
    // 从当前时间找到后 n 天时间
    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    String endTime = startTime;
    try {
      endTime = df.format(df.parse(startTime).getTime() + 3 * 24 * 60 * 60 * 1000L);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return relationBuyerTrainerLessonMapper.viewScheduleByBuyer(buyerId, startTime + "000", endTime + "111");
  }
}
