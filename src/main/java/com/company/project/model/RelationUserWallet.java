package com.company.project.model;

import javax.persistence.*;

@Table(name = "relation_user_wallet")
public class RelationUserWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 付钱方
     */
    @Column(name = "buyer_id")
    private Integer buyerId;

    /**
     * 收钱方
     */
    @Column(name = "wallet_id")
    private Integer walletId;

    /**
     * 100 = 1 元
     */
    private Integer money;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

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
     * 获取付钱方
     *
     * @return buyer_id - 付钱方
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 设置付钱方
     *
     * @param buyerId 付钱方
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取收钱方
     *
     * @return wallet_id - 收钱方
     */
    public Integer getWalletId() {
        return walletId;
    }

    /**
     * 设置收钱方
     *
     * @param walletId 收钱方
     */
    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    /**
     * 获取100 = 1 元
     *
     * @return money - 100 = 1 元
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 设置100 = 1 元
     *
     * @param money 100 = 1 元
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
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