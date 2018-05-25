package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRefer {
    private String referLogId;

    private Date referTime;

    private String userId;

    private String referId;

    private BigDecimal buyPv;

    private BigDecimal bonusRate;

    private BigDecimal bonusPv;

    public String getReferLogId() {
        return referLogId;
    }

    public void setReferLogId(String referLogId) {
        this.referLogId = referLogId == null ? null : referLogId.trim();
    }

    public Date getReferTime() {
        return referTime;
    }

    public void setReferTime(Date referTime) {
        this.referTime = referTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getReferId() {
        return referId;
    }

    public void setReferId(String referId) {
        this.referId = referId == null ? null : referId.trim();
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