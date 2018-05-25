package com.jbit.dao;

import com.jbit.entity.UserRecharge;

public interface UserRechargeDao {
    UserRecharge selectByPrimaryKey(String rechargeId);
}