package com.company.project.model;

import javax.persistence.*;

@Table(name = "relation_buyer_lesson")
public class RelationBuyerLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "buyer_id")
    private Integer buyerId;

    @Column(name = "trainer_lesson_id")
    private Integer trainerLessonId;

    @Column(name = "confirm_buyer")
    private Integer confirmBuyer;

    @Column(name = "confirm_trainer")
    private Integer confirmTrainer;

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
     * @return confirm_buyer
     */
    public Integer getConfirmBuyer() {
        return confirmBuyer;
    }

    /**
     * @param confirmBuyer
     */
    public void setConfirmBuyer(Integer confirmBuyer) {
        this.confirmBuyer = confirmBuyer;
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