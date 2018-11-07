package com.zju.cst.simplefitserver.model;

public class RelationBuyerTrainerLesson {
    private Integer id;

    private Integer buyerId;

    private Integer trainerLessonId;

    private String time;

    private Integer confirmTrainer;

    private Integer confirmBuyer;

    private String createTime;

    private String updateTime;

    private Integer validation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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
}