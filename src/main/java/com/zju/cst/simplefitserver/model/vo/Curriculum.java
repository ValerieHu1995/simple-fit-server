package com.zju.cst.simplefitserver.model.vo;

import java.io.Serializable;

public class Curriculum implements Serializable {
  // 单节课的实际响应结果
  // 课表项
  private Integer buyerId;
  private Integer trainerLessonId;
  private Integer lessonId;
  private Integer trainerId;
  private Integer shopId;
  private Integer type; // 团课 私课
  private String time; // 上课时间
  private String name; // 课程名
  private Integer confirmTrainer; // 单次课确认
  private Integer confirmBuyer; // 单次课确认
  private Integer capacity; // 上课容量
  private Integer frequency; // 上课次数
  private String trainerName; // 教练名字
  private String address; // 上课地点

  public Integer getBuyerId() {
    return buyerId;
  }

  public void setBuyerId(Integer buyerId) {
    this.buyerId = buyerId;
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

  public Integer getTrainerId() {
    return trainerId;
  }

  public void setTrainerId(Integer trainerId) {
    this.trainerId = trainerId;
  }

  public Integer getShopId() {
    return shopId;
  }

  public void setShopId(Integer shopId) {
    this.shopId = shopId;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getConfirmTrainer() {
    return confirmTrainer;
  }

  public void setConfirmTrainer(Integer confirmTrainer) {
    this.confirmTrainer = confirmTrainer;
  }

  public Integer getConfirmBuyer() {
    return confirmBuyer;
  }

  public void setConfirmBuyer(Integer confirmBuyer) {
    this.confirmBuyer = confirmBuyer;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public String getTrainerName() {
    return trainerName;
  }

  public void setTrainerName(String trainerName) {
    this.trainerName = trainerName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
