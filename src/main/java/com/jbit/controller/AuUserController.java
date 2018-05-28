package com.jbit.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbit.entity.AuUser;
import com.jbit.entity.JsonResult;
import com.jbit.service.AuUserService;


@Controller
public class AuUserController {
	
	@Resource 
	private AuUserService auUserService;
	
	@ResponseBody
	@RequestMapping(value="/AuUserLogin",method=RequestMethod.POST)
	public JsonResult AuUserLogin(AuUser auUser,Model model,HttpSession session){
		JsonResult result = new JsonResult("登录失败！！");
		AuUser au= auUserService.login(auUser);
		if(au!=null){
			session.setAttribute("AuUser", au);
			result=new JsonResult(true,"登录成功！！");
		}
		return result;
	}
}
