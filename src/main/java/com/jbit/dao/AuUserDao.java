package com.jbit.dao;

import com.jbit.entity.AuUser;

public interface AuUserDao {
	/**
	 * 登录
	 */
    AuUser login(AuUser user);
}