package com.jbit.dao;

import com.jbit.entity.UserPointGoods;

public interface UserPointGoodsDao {
    UserPointGoods selectByPrimaryKey(String pointGoodsId);
}