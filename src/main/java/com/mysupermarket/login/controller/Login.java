package com.mysupermarket.login.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class Login {
	
	@RequestMapping("login")
	public String login(){
		System.out.println("进来login了");
		return "Login.html";
	}
	
}
