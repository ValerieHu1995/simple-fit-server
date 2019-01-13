package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoDetailBuyer;
import com.zju.cst.simplefitserver.model.vo.User;
import org.apache.ibatis.annotations.Param;

public interface InfoDetailBuyerMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(InfoDetailBuyer record);

  int insertSelective(InfoDetailBuyer record);

  InfoDetailBuyer selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(InfoDetailBuyer record);

  int updateByPrimaryKey(InfoDetailBuyer record);

  // 购卡
  int buyCard(@Param("buyerId") Integer buyerId,
              @Param("walletId") Integer walletId, // 店主的 userId
              @Param("obtainTime") String startTime,
              @Param("expireTime") String endTime,
              @Param("createTime") Integer createTime,
              @Param("money") Integer money);

  // 购课
  int buyLesson(@Param("buyerId") Integer buyerId,
                @Param("money") Integer money,
                @Param("createTime") Integer createTime,
                @Param("trainerLessonId") Integer trainerLessonId);

  // 根据 userId 获取 buyerId
  InfoDetailBuyer getBuyer(@Param("userId") Integer userId);

  // 获取登录时信息
  User getInfo(@Param("username") String username);
}
