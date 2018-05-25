package com.jbit.dao;

import com.jbit.entity.BasicsParameter;

public interface BasicsParameterDao {
    BasicsParameter selectByPrimaryKey(String id);
}