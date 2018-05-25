package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPointGoods {
    private String pointGoodsId;

    private Date pickTime;

    private String userId;

    private BigDecimal buyPv;

    private String orderId;

    public String getPointGoodsId() {
        return pointGoodsId;
    }

    public void setPointGoodsId(String pointGoodsId) {
        this.pointGoodsId = pointGoodsId == null ? null : pointGoodsId.trim();
    }

    public Date getPickTime() {
        return pickTime;
    }

    public void setPickTime(Date pickTime) {
        this.pickTime = pickTime;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}