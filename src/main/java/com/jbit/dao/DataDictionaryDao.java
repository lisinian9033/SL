package com.jbit.dao;

import com.jbit.entity.DataDictionary;

public interface DataDictionaryDao {
    DataDictionary selectByPrimaryKey(Long id);
}