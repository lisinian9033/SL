package com.jbit.dao;

import com.jbit.entity.UserBuyBonus;

public interface UserBuyBonusDao {
    UserBuyBonus selectByPrimaryKey(String buyBonusId);
}