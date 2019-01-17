package com.zju.cst.simplefitserver.model.vo;

import java.io.Serializable;

public class RealLesson implements Serializable {
  // 教练
  private Integer trainerId; // 教练号
  private String realname; // 教练姓名
  // 课程
  private Integer trainerLessonId; // 教练开课号
  private Integer lessonId; // 课程号
  private Integer lessonCapacity; // 课程容量
  private String time; // 上课时间
  private String category; // 课程在数据表中的名字 比如：瑜伽、跑步
  private Integer type; // 课程类型
  private Integer frequency; // 上课次数
  // 店铺
  private Integer shopId; // 店铺 id
  private String shopName; // 店铺名
  private String address; // 店铺地址
  private Integer shopCapacity; // 店铺容量
  // 店主信息
  private Integer ownerId; // 店主 id

  public Integer getTrainerId() {
    return trainerId;
  }

  public void setTrainerId(Integer trainerId) {
    this.trainerId = trainerId;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public Integer getTrainerLessonId() {
    return trainerLessonId;
  }

  public void setTrainerLessonId(Integer trainerLessonId) {
    this.trainerLessonId = trainerLessonId;
  }

  public Integer getLessonId() {
    return lessonId;
  }

  public void setLessonId(Integer lessonId) {
    this.lessonId = lessonId;
  }

  public Integer getLessonCapacity() {
    return lessonCapacity;
  }

  public void setLessonCapacity(Integer lessonCapacity) {
    this.lessonCapacity = lessonCapacity;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Integer getShopId() {
    return shopId;
  }

  public void setShopId(Integer shopId) {
    this.shopId = shopId;
  }

  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getShopCapacity() {
    return shopCapacity;
  }

  public void setShopCapacity(Integer shopCapacity) {
    this.shopCapacity = shopCapacity;
  }

  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }
}
