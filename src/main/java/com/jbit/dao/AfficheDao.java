package com.jbit.dao;

import com.jbit.entity.Affiche;

public interface AfficheDao {
    Affiche selectByPrimaryKey(Long id);
}