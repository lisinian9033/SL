package com.jbit.service;

import com.jbit.entity.AuUser;

public interface AuUserService {

	/**
	 * 登录
	 * @param username
	 * @param pwd
	 * @return
	 */
	AuUser login(AuUser auUser);
}
