package com.jbit.dao;

import com.jbit.entity.InfoAnnexes;

public interface InfoAnnexesDao {
    InfoAnnexes selectByPrimaryKey(String id);
}