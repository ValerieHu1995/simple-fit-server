package com.company.project.model;

import javax.persistence.*;

@Table(name = "info_detail_buyer")
public class InfoDetailBuyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 开卡时间
     */
    @Column(name = "obtain_time")
    private String obtainTime;

    /**
     * 结束时间
     */
    @Column(name = "expire_time")
    private String expireTime;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_time")
    private String updateTime;

    /**
     * 是否删除
     */
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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取开卡时间
     *
     * @return obtain_time - 开卡时间
     */
    public String getObtainTime() {
        return obtainTime;
    }

    /**
     * 设置开卡时间
     *
     * @param obtainTime 开卡时间
     */
    public void setObtainTime(String obtainTime) {
        this.obtainTime = obtainTime;
    }

    /**
     * 获取结束时间
     *
     * @return expire_time - 结束时间
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * 设置结束时间
     *
     * @param expireTime 结束时间
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
     * 获取是否删除
     *
     * @return validation - 是否删除
     */
    public Integer getValidation() {
        return validation;
    }

    /**
     * 设置是否删除
     *
     * @param validation 是否删除
     */
    public void setValidation(Integer validation) {
        this.validation = validation;
    }
}