package com.jbit.dao;

import com.jbit.entity.UuserCash;

public interface UuserCashDao {
    UuserCash selectByPrimaryKey(String cashId);
}