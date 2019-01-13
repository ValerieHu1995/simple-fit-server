package com.zju.cst.simplefitserver.model.vo;

import java.io.Serializable;

public class ShopAndSeller implements Serializable {
  // 商店和店主信息
  // seller
  private Integer ownerId;
  private String realname; // 店主名字
  // shop
  private Integer shopId;
  private String name; // 店名
  private String address; // 店地址
  private Integer capacity; // 最大上课数

  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public Integer getShopId() {
    return shopId;
  }

  public void setShopId(Integer shopId) {
    this.shopId = shopId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }
}
