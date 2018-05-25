package com.jbit.dao;

import com.jbit.entity.MultiLlan;

public interface MultiLlanDao {
    MultiLlan selectByPrimaryKey(String elementId);
}