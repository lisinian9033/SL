package com.jbit.dao;

import com.jbit.entity.UserBuy;

public interface UserBuyDao {
    UserBuy selectByPrimaryKey(String buyId);
}