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
	
	@RequestMapping(value="/AuUserLogin",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult AuUserLogin(AuUser user,HttpSession session){
		System.out.println(user);
		JsonResult result = new JsonResult("登录失败！！");
		AuUser au= auUserService.login(user);
		if(au!=null){
			session.setAttribute("user", au);
			result=new JsonResult(true,"登录成功！！");
		}
		return result;
	}

	/**
	 * 注销
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();// 消除session
		return "pages/index";
	}
}
