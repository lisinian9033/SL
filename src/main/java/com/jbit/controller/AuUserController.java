package com.jbit.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value="/AuUserLogin",method=RequestMethod.GET)
	@ResponseBody
	public JsonResult AuUserLogin(@RequestBody AuUser user,Model model,HttpSession session){
		System.out.println("------->"+user.toString());
		JsonResult result = new JsonResult("登录失败！！");
		AuUser au= auUserService.login(user);
		System.out.println("------->"+au);
		if(au!=null){
			session.setAttribute("AuUser", au);
			result=new JsonResult(true,"登录成功！！");
		}
		System.out.println("------->"+result);
		return result;
	}

	public void setAuUserService(AuUserService auUserService) {
		this.auUserService = auUserService;
	}
	
	
}
