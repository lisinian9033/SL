package com.jbit.dao;

import com.jbit.entity.InvenTory;

public interface InvenToryDao {
    InvenTory selectByPrimaryKey(String id);
}