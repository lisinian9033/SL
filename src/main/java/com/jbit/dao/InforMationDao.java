package com.jbit.dao;

import com.jbit.entity.InforMation;

public interface InforMationDao {
    InforMation selectByPrimaryKey(Long id);
}