package com.vinh.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

	@RequestMapping("/user/form")
	public String showForm() {
		return "user/login";
	}
	
	@RequestMapping("user/login")
	public String login(ModelMap model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		
		
		if(id.equals("admin") && pw.equals("123")) {
//			request.setAttribute("uid", id);
//			request.setAttribute("pwd", pw);
			model.addAttribute("uid", id);
			model.addAttribute("pwd", pw);
			return "user/info";
		}
//		request.setAttribute("message", "Sai thông tin đăng nhập!");
		model.addAttribute("message", "Sai thông tin đăng nhập!");
		return "user/login";
	}
}
