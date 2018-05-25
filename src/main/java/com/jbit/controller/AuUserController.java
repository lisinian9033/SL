package com.jbit.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbit.entity.AuUser;
import com.jbit.service.AuUserService;


@Controller
public class AuUserController {

	
	
	@Resource 
	private AuUserService auUserService;
	
	
	@RequestMapping(value="/AuUserLogin")
	public String AuUserLogin(AuUser auUser,Model model,HttpSession session){
		AuUser au= auUserService.login(auUser);
		if(au!=null){
			session.setAttribute("AuUser", au);
			return "pages/main.jsp";
		}
		model.addAttribute("error","登录失败");
		return "pages/main.jsp";
	}
}
