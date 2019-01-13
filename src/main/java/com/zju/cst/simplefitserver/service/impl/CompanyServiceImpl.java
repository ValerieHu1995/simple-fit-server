package com.zju.cst.simplefitserver.service.impl;

import com.zju.cst.simplefitserver.dao.mapper.InfoDetailSellerMapper;
import com.zju.cst.simplefitserver.dao.mapper.RelationBuyerTrainerLessonMapper;
import com.zju.cst.simplefitserver.dao.mapper.RelationUserWalletMapper;
import com.zju.cst.simplefitserver.model.InfoDetailSeller;
import com.zju.cst.simplefitserver.model.vo.Curriculum;
import com.zju.cst.simplefitserver.model.vo.User;
import com.zju.cst.simplefitserver.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@Service
public class CompanyServiceImpl implements CompanyService {

  @Autowired
  InfoDetailSellerMapper infoDetailSellerMapper;

  @Override
  public InfoDetailSeller getSeller(Integer userId) {
    return infoDetailSellerMapper.getSeller(userId);
  }

  @Autowired
  RelationUserWalletMapper relationUserWalletMapper;

  // 获取今日购卡
  // walletId 就是 userId，在增加 user 的时候自动增加 walletId
  @Override
  public List<Integer> getCardNumToday(Integer walletId, Integer createTime) {
    return relationUserWalletMapper.getCardNumToday(walletId, createTime);
  }

  // 获取今日买课数
  @Override
  public Integer getLessonNumToday(Integer walletId, Integer createTime) {
    return relationUserWalletMapper.getLessonNumToday(walletId, createTime);
  }

  // 获取商家登录信息
  @Override
  public User getInfo(String username) {
    return infoDetailSellerMapper.getInfo(username);
  }

  @Autowired
  RelationBuyerTrainerLessonMapper relationBuyerTrainerLessonMapper;

  // 商家获取三天上课信息
  @Override
  public List<Curriculum> viewSchedule(Integer sellerId, String startTime) {
    // 从当前时间找到后 n 天时间
    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    String endTime = startTime;
    try {
      endTime = df.format(df.parse(startTime).getTime() + 3 * 24 * 60 * 60 * 1000L);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return relationBuyerTrainerLessonMapper.viewScheduleBySeller(sellerId, startTime + "000", endTime + "111");
  }
}
