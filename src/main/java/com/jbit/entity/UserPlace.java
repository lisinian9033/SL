package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPlace {
    private String placeId;

    private Date placeTime;

    private String bonusUserId;

    private String userId;

    private BigDecimal buyPv;

    private BigDecimal bonusRate;

    private BigDecimal bonusPv;

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public Date getPlaceTime() {
        return placeTime;
    }

    public void setPlaceTime(Date placeTime) {
        this.placeTime = placeTime;
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