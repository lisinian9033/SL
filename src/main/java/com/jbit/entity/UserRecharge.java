package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRecharge {
    private String rechargeId;

    private Date rechargeTime;

    private String rechargeNum;

    private String userId;

    private String currency;

    private BigDecimal rechargeMoney;

    private String note;

    private BigDecimal creditedMoney;

    private Date creditedTime;

    private String auditUser;

    private BigDecimal pvRate;

    private BigDecimal pv;

    private String bankName;

    private String bankAccount;

    private String platform;

    private String param;

    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId == null ? null : rechargeId.trim();
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getRechargeNum() {
        return rechargeNum;
    }

    public void setRechargeNum(String rechargeNum) {
        this.rechargeNum = rechargeNum == null ? null : rechargeNum.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getCreditedMoney() {
        return creditedMoney;
    }

    public void setCreditedMoney(BigDecimal creditedMoney) {
        this.creditedMoney = creditedMoney;
    }

    public Date getCreditedTime() {
        return creditedTime;
    }

    public void setCreditedTime(Date creditedTime) {
        this.creditedTime = creditedTime;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    public BigDecimal getPvRate() {
        return pvRate;
    }

    public void setPvRate(BigDecimal pvRate) {
        this.pvRate = pvRate;
    }

    public BigDecimal getPv() {
        return pv;
    }

    public void setPv(BigDecimal pv) {
        this.pv = pv;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}