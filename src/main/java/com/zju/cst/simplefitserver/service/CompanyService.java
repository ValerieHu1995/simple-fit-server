package com.zju.cst.simplefitserver.service;

import com.zju.cst.simplefitserver.model.InfoDetailSeller;
import com.zju.cst.simplefitserver.model.vo.Curriculum;
import com.zju.cst.simplefitserver.model.vo.User;

import java.util.List;

public interface CompanyService {
  // 根据 userID 获取信息
  InfoDetailSeller getSeller(Integer userId);

  // 获取今日购卡
  List<Integer> getCardNumToday(Integer walletId, Integer createTime);

  // 获取今日买课数
  Integer getLessonNumToday(Integer walletId, Integer createTime);

  // 获取商家登录信息
  User getInfo(String username);

  // 商家获取三天上课信息
  List<Curriculum> viewSchedule(Integer sellerId, String startTime);
}
