package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPair201312 {
    private String pairId;

    private Date date;

    private String bonusUserId;

    private Integer leftUser;

    private Integer rightUser;

    private Integer leftKeep;

    private Integer rightKeep;

    private BigDecimal eachPv;

    private BigDecimal sumPairPv;

    private BigDecimal bonusRate;

    private BigDecimal bonusPv;

    public String getPairId() {
        return pairId;
    }

    public void setPairId(String pairId) {
        this.pairId = pairId == null ? null : pairId.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBonusUserId() {
        return bonusUserId;
    }

    public void setBonusUserId(String bonusUserId) {
        this.bonusUserId = bonusUserId == null ? null : bonusUserId.trim();
    }

    public Integer getLeftUser() {
        return leftUser;
    }

    public void setLeftUser(Integer leftUser) {
        this.leftUser = leftUser;
    }

    public Integer getRightUser() {
        return rightUser;
    }

    public void setRightUser(Integer rightUser) {
        this.rightUser = rightUser;
    }

    public Integer getLeftKeep() {
        return leftKeep;
    }

    public void setLeftKeep(Integer leftKeep) {
        this.leftKeep = leftKeep;
    }

    public Integer getRightKeep() {
        return rightKeep;
    }

    public void setRightKeep(Integer rightKeep) {
        this.rightKeep = rightKeep;
    }

    public BigDecimal getEachPv() {
        return eachPv;
    }

    public void setEachPv(BigDecimal eachPv) {
        this.eachPv = eachPv;
    }

    public BigDecimal getSumPairPv() {
        return sumPairPv;
    }

    public void setSumPairPv(BigDecimal sumPairPv) {
        this.sumPairPv = sumPairPv;
    }

    public BigDecimal getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(BigDecimal bonusRate) {
        this.bonusRate = bonusRate;
    }

    public BigDecimal getBonusPv() {
        return bonusPv;
    }

    public void setBonusPv(BigDecimal bonusPv) {
        this.bonusPv = bonusPv;
    }
}