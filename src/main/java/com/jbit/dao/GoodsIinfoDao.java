package com.jbit.dao;

import com.jbit.entity.GoodsIinfoWithBLOBs;

public interface GoodsIinfoDao {
    GoodsIinfoWithBLOBs selectByPrimaryKey(Long id);
}