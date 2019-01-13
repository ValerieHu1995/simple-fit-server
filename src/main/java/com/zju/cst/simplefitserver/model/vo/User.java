package com.zju.cst.simplefitserver.model.vo;

import java.io.Serializable;

public class User implements Serializable {
  private Integer id;

  private String username;

  private String password;

  private Integer gender;

  private String birthday;

  private String phone;

  private Integer verifyPhone;

  private String email;

  private Integer verifyEmail;

  private String alipay;

  private String wechatpay;

  private String createTime;

  private String updateTime;

  private Integer validation;

  private Integer type;

  private Integer typeId; // 存放角色的具体 id

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getVerifyPhone() {
    return verifyPhone;
  }

  public void setVerifyPhone(Integer verifyPhone) {
    this.verifyPhone = verifyPhone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getVerifyEmail() {
    return verifyEmail;
  }

  public void setVerifyEmail(Integer verifyEmail) {
    this.verifyEmail = verifyEmail;
  }

  public String getAlipay() {
    return alipay;
  }

  public void setAlipay(String alipay) {
    this.alipay = alipay;
  }

  public String getWechatpay() {
    return wechatpay;
  }

  public void setWechatpay(String wechatpay) {
    this.wechatpay = wechatpay;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getValidation() {
    return validation;
  }

  public void setValidation(Integer validation) {
    this.validation = validation;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }
}
