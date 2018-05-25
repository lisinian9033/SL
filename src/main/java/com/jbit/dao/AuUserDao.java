package com.jbit.dao;

import com.jbit.entity.AuUser;

public interface AuUserDao {
    AuUser selectByPrimaryKey(Long id);
}