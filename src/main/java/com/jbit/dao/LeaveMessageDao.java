package com.jbit.dao;

import com.jbit.entity.LeaveMessage;

public interface LeaveMessageDao {
    LeaveMessage selectByPrimaryKey(Long id);
}