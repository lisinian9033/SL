package com.jbit.dao;

import com.jbit.entity.UserRefer;

public interface UserReferDao {
    UserRefer selectByPrimaryKey(String referLogId);
}