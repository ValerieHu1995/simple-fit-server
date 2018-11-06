package com.company.project.model;

import javax.persistence.*;

@Table(name = "relation_buyer_trainer_lesson")
public class RelationBuyerTrainerLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "buyer_id")
    private Integer buyerId;

    @Column(name = "trainer_lesson_id")
    private Integer trainerLessonId;

    /**
     * 每次上课的上课时间
     */
    private String time;

    /**
     * 教练确认该节课结束
     */
    @Column(name = "confirm_trainer")
    private Integer confirmTrainer;

    /**
     * 学员确认该节课结束
     */
    @Column(name = "confirm_buyer")
    private Integer confirmBuyer;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_time")
    private String updateTime;

    private Integer validation;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return buyer_id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * @param buyerId
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * @return trainer_lesson_id
     */
    public Integer getTrainerLessonId() {
        return trainerLessonId;
    }

    /**
     * @param trainerLessonId
     */
    public void setTrainerLessonId(Integer trainerLessonId) {
        this.trainerLessonId = trainerLessonId;
    }

    /**
     * 获取每次上课的上课时间
     *
     * @return time - 每次上课的上课时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置每次上课的上课时间
     *
     * @param time 每次上课的上课时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取教练确认该节课结束
     *
     * @return confirm_trainer - 教练确认该节课结束
     */
    public Integer getConfirmTrainer() {
        return confirmTrainer;
    }

    /**
     * 设置教练确认该节课结束
     *
     * @param confirmTrainer 教练确认该节课结束
     */
    public void setConfirmTrainer(Integer confirmTrainer) {
        this.confirmTrainer = confirmTrainer;
    }

    /**
     * 获取学员确认该节课结束
     *
     * @return confirm_buyer - 学员确认该节课结束
     */
    public Integer getConfirmBuyer() {
        return confirmBuyer;
    }

    /**
     * 设置学员确认该节课结束
     *
     * @param confirmBuyer 学员确认该节课结束
     */
    public void setConfirmBuyer(Integer confirmBuyer) {
        this.confirmBuyer = confirmBuyer;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return validation
     */
    public Integer getValidation() {
        return validation;
    }

    /**
     * @param validation
     */
    public void setValidation(Integer validation) {
        this.validation = validation;
    }
}