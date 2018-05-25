package com.jbit.dao;

import com.jbit.entity.Reply;

public interface ReplyDao {
    Reply selectByPrimaryKey(Long id);
}