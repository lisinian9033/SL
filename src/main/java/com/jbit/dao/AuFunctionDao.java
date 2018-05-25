package com.jbit.dao;

import com.jbit.entity.AuFunction;

public interface AuFunctionDao {
    AuFunction selectByPrimaryKey(Long id);
}