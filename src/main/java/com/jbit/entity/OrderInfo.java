package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private String orderId;

    private String listId;

    private Date orderTime;

    private String orderSn;

    private String pickUserId;

    private BigDecimal repeatPv;

    private BigDecimal basePv;

    private BigDecimal serviceFee;

    private BigDecimal shipFre;

    private BigDecimal tax;

    private String country;

    private String tel;

    private String mobile;

    private String email;

    private String userAddress;

    private String postcode;

    private Integer stat;

    private String shipType;

    private String shipNum;

    private Date shipTime;

    private Date receiveTime;

    private String shipNote;

    private String buyUserId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getPickUserId() {
        return pickUserId;
    }

    public void setPickUserId(String pickUserId) {
        this.pickUserId = pickUserId == null ? null : pickUserId.trim();
    }

    public BigDecimal getRepeatPv() {
        return repeatPv;
    }

    public void setRepeatPv(BigDecimal repeatPv) {
        this.repeatPv = repeatPv;
    }

    public BigDecimal getBasePv() {
        return basePv;
    }

    public void setBasePv(BigDecimal basePv) {
        this.basePv = basePv;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getShipFre() {
        return shipFre;
    }

    public void setShipFre(BigDecimal shipFre) {
        this.shipFre = shipFre;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    public String getShipNum() {
        return shipNum;
    }

    public void setShipNum(String shipNum) {
        this.shipNum = shipNum == null ? null : shipNum.trim();
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getShipNote() {
        return shipNote;
    }

    public void setShipNote(String shipNote) {
        this.shipNote = shipNote == null ? null : shipNote.trim();
    }

    public String getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(String buyUserId) {
        this.buyUserId = buyUserId == null ? null : buyUserId.trim();
    }
}