package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserBuyBonus {
    private String buyBonusId;

    private String bonusMonth;

    private Date calTime;

    private String bonusUserId;

    private BigDecimal buyPv;

    private BigDecimal bonusRate;

    private BigDecimal bonusPv;

    public String getBuyBonusId() {
        return buyBonusId;
    }

    public void setBuyBonusId(String buyBonusId) {
        this.buyBonusId = buyBonusId == null ? null : buyBonusId.trim();
    }

    public String getBonusMonth() {
        return bonusMonth;
    }

    public void setBonusMonth(String bonusMonth) {
        this.bonusMonth = bonusMonth == null ? null : bonusMonth.trim();
    }

    public Date getCalTime() {
        return calTime;
    }

    public void setCalTime(Date calTime) {
        this.calTime = calTime;
    }

    public String getBonusUserId() {
        return bonusUserId;
    }

    public void setBonusUserId(String bonusUserId) {
        this.bonusUserId = bonusUserId == null ? null : bonusUserId.trim();
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