package com.company.project.model;

import javax.persistence.*;

@Table(name = "info_shop")
public class InfoShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 这里存的是商家的 id
     */
    @Column(name = "owner_id")
    private Integer ownerId;

    /**
     * 店名
     */
    private String name;

    /**
     * 地址
     */
    private String address;

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
     * 获取这里存的是商家的 id
     *
     * @return owner_id - 这里存的是商家的 id
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * 设置这里存的是商家的 id
     *
     * @param ownerId 这里存的是商家的 id
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 获取店名
     *
     * @return name - 店名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置店名
     *
     * @param name 店名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
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