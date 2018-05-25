package com.jbit.dao;

import com.jbit.entity.OrderList;

public interface OrderListDao {
    OrderList selectByPrimaryKey(String listId);
}