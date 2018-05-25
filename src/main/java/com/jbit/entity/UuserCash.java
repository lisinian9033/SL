package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UuserCash {
    private String cashId;

    private Date cashTime;

    private String cashNum;

    private String userId;

    private BigDecimal cashPv;

    private String currency;

    private BigDecimal pvRate;

    private BigDecimal cashMoney;

    private String note;

    private BigDecimal fee;

    private BigDecimal tax;

    private BigDecimal otherFee;

    private String bankName;

    private String bankBrance;

    private String bankAccount;

    private String accountName;

    private Integer stat;

    private BigDecimal creditedMoney;

    private Date creditedTime;

    private String operator;

    public String getCashId() {
        return cashId;
    }

    public void setCashId(String cashId) {
        this.cashId = cashId == null ? null : cashId.trim();
    }

    public Date getCashTime() {
        return cashTime;
    }

    public void setCashTime(Date cashTime) {
        this.cashTime = cashTime;
    }

    public String getCashNum() {
        return cashNum;
    }

    public void setCashNum(String cashNum) {
        this.cashNum = cashNum == null ? null : cashNum.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getCashPv() {
        return cashPv;
    }

    public void setCashPv(BigDecimal cashPv) {
        this.cashPv = cashPv;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getPvRate() {
        return pvRate;
    }

    public void setPvRate(BigDecimal pvRate) {
        this.pvRate = pvRate;
    }

    public BigDecimal getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(BigDecimal cashMoney) {
        this.cashMoney = cashMoney;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankBrance() {
        return bankBrance;
    }

    public void setBankBrance(String bankBrance) {
        this.bankBrance = bankBrance == null ? null : bankBrance.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}