package com.company.project.model;

import javax.persistence.*;

@Table(name = "relation_trainer_lesson")
public class RelationTrainerLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名
     */
    private String name;

    /**
     * 不是 uid 请注意！
     */
    @Column(name = "trainer_credential_id")
    private Integer trainerCredentialId;

    @Column(name = "lesson_credentail_id")
    private Integer lessonCredentailId;

    /**
     * 代表在哪儿上课
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 课程容量
     */
    private Integer capacity;

    /**
     * 上课次数
     */
    private Integer frequency;

    /**
     * 代表上课时间
     */
    private String time;

    /**
     * 0代表申请中，1代表申请成功，2代表申请失败，3代表过期
     */
    private Integer status;

    @Column(name = "confirm_trainer")
    private Integer confirmTrainer;

    @Column(name = "confirm_seller")
    private Integer confirmSeller;

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
     * 获取课程名
     *
     * @return name - 课程名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名
     *
     * @param name 课程名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取不是 uid 请注意！
     *
     * @return trainer_credential_id - 不是 uid 请注意！
     */
    public Integer getTrainerCredentialId() {
        return trainerCredentialId;
    }

    /**
     * 设置不是 uid 请注意！
     *
     * @param trainerCredentialId 不是 uid 请注意！
     */
    public void setTrainerCredentialId(Integer trainerCredentialId) {
        this.trainerCredentialId = trainerCredentialId;
    }

    /**
     * @return lesson_credentail_id
     */
    public Integer getLessonCredentailId() {
        return lessonCredentailId;
    }

    /**
     * @param lessonCredentailId
     */
    public void setLessonCredentailId(Integer lessonCredentailId) {
        this.lessonCredentailId = lessonCredentailId;
    }

    /**
     * 获取代表在哪儿上课
     *
     * @return shop_id - 代表在哪儿上课
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置代表在哪儿上课
     *
     * @param shopId 代表在哪儿上课
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取课程容量
     *
     * @return capacity - 课程容量
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * 设置课程容量
     *
     * @param capacity 课程容量
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取上课次数
     *
     * @return frequency - 上课次数
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * 设置上课次数
     *
     * @param frequency 上课次数
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * 获取代表上课时间
     *
     * @return time - 代表上课时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置代表上课时间
     *
     * @param time 代表上课时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取0代表申请中，1代表申请成功，2代表申请失败，3代表过期
     *
     * @return status - 0代表申请中，1代表申请成功，2代表申请失败，3代表过期
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0代表申请中，1代表申请成功，2代表申请失败，3代表过期
     *
     * @param status 0代表申请中，1代表申请成功，2代表申请失败，3代表过期
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return confirm_trainer
     */
    public Integer getConfirmTrainer() {
        return confirmTrainer;
    }

    /**
     * @param confirmTrainer
     */
    public void setConfirmTrainer(Integer confirmTrainer) {
        this.confirmTrainer = confirmTrainer;
    }

    /**
     * @return confirm_seller
     */
    public Integer getConfirmSeller() {
        return confirmSeller;
    }

    /**
     * @param confirmSeller
     */
    public void setConfirmSeller(Integer confirmSeller) {
        this.confirmSeller = confirmSeller;
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