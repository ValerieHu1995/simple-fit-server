package com.company.project.model;

import javax.persistence.*;

@Table(name = "relation_trainer_credential")
public class RelationTrainerCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "trainer_id")
    private Integer trainerId;

    @Column(name = "credentail_id")
    private Integer credentailId;

    /**
     * 0代表申请中，1代表申请成功，2代表申请失败，3代表过期
     */
    private Integer status;

    @Column(name = "obtain_time")
    private String obtainTime;

    @Column(name = "expire_time")
    private String expireTime;

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
     * @return trainer_id
     */
    public Integer getTrainerId() {
        return trainerId;
    }

    /**
     * @param trainerId
     */
    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    /**
     * @return credentail_id
     */
    public Integer getCredentailId() {
        return credentailId;
    }

    /**
     * @param credentailId
     */
    public void setCredentailId(Integer credentailId) {
        this.credentailId = credentailId;
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
     * @return obtain_time
     */
    public String getObtainTime() {
        return obtainTime;
    }

    /**
     * @param obtainTime
     */
    public void setObtainTime(String obtainTime) {
        this.obtainTime = obtainTime;
    }

    /**
     * @return expire_time
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
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