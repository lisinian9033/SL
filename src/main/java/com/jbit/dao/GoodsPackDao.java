package com.jbit.dao;

import com.jbit.entity.GoodsPack;

public interface GoodsPackDao {
    GoodsPack selectByPrimaryKey(Long id);
}