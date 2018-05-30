package com.jbit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jbit.entity.Affiche;
import com.jbit.service.AfficheService;

@Controller
public class AfficheController {

	@Resource
	private AfficheService afficheService;
	
	@RequestMapping(value="/afficheList",method=RequestMethod.GET)
	public String afficheList(HttpSession session){
		List<Affiche> infoList=afficheService.GetAfficheList();
		session.setAttribute("infoList", infoList);
		return "pages/main";
	}
}
