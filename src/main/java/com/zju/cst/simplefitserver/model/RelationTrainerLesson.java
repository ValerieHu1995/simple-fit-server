package com.zju.cst.simplefitserver.model;

import java.io.Serializable;

public class RelationTrainerLesson implements Serializable {
    private Integer id;

    private String name;

    private Integer trainerId;

    private Integer lessonId;

    private Integer shopId;

    private Integer capacity;

    private Integer frequency;

    private String time;

    private Integer status;

    private Integer confirmTrainer;

    private Integer confirmSeller;

    private Integer type;

    private String createTime;

    private String updateTime;

    private Integer validation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getConfirmTrainer() {
        return confirmTrainer;
    }

    public void setConfirmTrainer(Integer confirmTrainer) {
        this.confirmTrainer = confirmTrainer;
    }

    public Integer getConfirmSeller() {
        return confirmSeller;
    }

    public void setConfirmSeller(Integer confirmSeller) {
        this.confirmSeller = confirmSeller;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Integer getValidation() {
        return validation;
    }

    public void setValidation(Integer validation) {
        this.validation = validation;
    }
    // 测试用

    @Override
    public String toString() {
        return "RelationTrainerLesson{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", trainerId=" + trainerId +
            ", lessonId=" + lessonId +
            ", shopId=" + shopId +
            ", capacity=" + capacity +
            ", frequency=" + frequency +
            ", time='" + time + '\'' +
            ", status=" + status +
            ", confirmTrainer=" + confirmTrainer +
            ", confirmSeller=" + confirmSeller +
            ", type=" + type +
            ", createTime='" + createTime + '\'' +
            ", updateTime='" + updateTime + '\'' +
            ", validation=" + validation +
            '}';
    }
}