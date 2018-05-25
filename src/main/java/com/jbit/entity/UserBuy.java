package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserBuy {
    private String buyId;

    private Date buyTime;

    private String bonusUserId;

    private String userId;

    private BigDecimal buyPv;

    private BigDecimal bonusRate;

    private BigDecimal bonusPv;

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId == null ? null : buyId.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getBonusUserId() {
        return bonusUserId;
    }

    public void setBonusUserId(String bonusUserId) {
        this.bonusUserId = bonusUserId == null ? null : bonusUserId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getBuyPv() {
        return buyPv;
    }

    public void setBuyPv(BigDecimal buyPv) {
        this.buyPv = buyPv;
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