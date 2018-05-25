package com.jbit.dao;

import com.jbit.entity.UserPlace;

public interface UserPlaceDao {
    UserPlace selectByPrimaryKey(String placeId);
}