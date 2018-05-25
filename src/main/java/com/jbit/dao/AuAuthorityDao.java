package com.jbit.dao;

import com.jbit.entity.AuAuthority;

public interface AuAuthorityDao {
    AuAuthority selectByPrimaryKey(Long id);
}