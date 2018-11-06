package com.company.project.model;

import javax.persistence.*;

@Table(name = "info_user")
public class InfoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private Integer gender;

    private String birthday;

    private String phone;

    @Column(name = "verify_phone")
    private Integer verifyPhone;

    private String email;

    @Column(name = "verify_email")
    private Integer verifyEmail;

    private String alipay;

    private String wechatpay;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return verify_phone
     */
    public Integer getVerifyPhone() {
        return verifyPhone;
    }

    /**
     * @param verifyPhone
     */
    public void setVerifyPhone(Integer verifyPhone) {
        this.verifyPhone = verifyPhone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return verify_email
     */
    public Integer getVerifyEmail() {
        return verifyEmail;
    }

    /**
     * @param verifyEmail
     */
    public void setVerifyEmail(Integer verifyEmail) {
        this.verifyEmail = verifyEmail;
    }

    /**
     * @return alipay
     */
    public String getAlipay() {
        return alipay;
    }

    /**
     * @param alipay
     */
    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    /**
     * @return wechatpay
     */
    public String getWechatpay() {
        return wechatpay;
    }

    /**
     * @param wechatpay
     */
    public void setWechatpay(String wechatpay) {
        this.wechatpay = wechatpay;
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