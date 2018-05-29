package com.jbit.dao;

import com.jbit.entity.AuUser;

public interface AuUserDao {
	/**
	 * 登录
	 * @param username
	 * @param pwd
	 * @return
	 */
    AuUser login(AuUser user);
}