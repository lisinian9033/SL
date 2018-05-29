package com.jbit.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jbit.dao.AfficheDao;
import com.jbit.entity.Affiche;
import com.jbit.service.AfficheService;
@Service("afficheService")
public class AfficheServiceImpl implements AfficheService{

	@Resource
	private AfficheDao afficheDao;
	
	@Override
	public List<Affiche> GetAfficheList() {
		return afficheDao.GetAfficheList();
	}

}
