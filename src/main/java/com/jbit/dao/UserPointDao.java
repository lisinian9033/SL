package com.jbit.dao;

import com.jbit.entity.UserPoint;

public interface UserPointDao {
    UserPoint selectByPrimaryKey(String pointId);
}