package com.jbit.dao;


import java.util.List;

import com.jbit.entity.Affiche;

public interface AfficheDao {
    Affiche selectByPrimaryKey(Long id);
    
    /**
     * 获取所有资讯列表
     */
    List<Affiche> GetAfficheList();
}