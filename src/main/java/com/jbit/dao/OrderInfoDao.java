package com.jbit.dao;

import com.jbit.entity.OrderInfo;

public interface OrderInfoDao {
    OrderInfo selectByPrimaryKey(String orderId);
}