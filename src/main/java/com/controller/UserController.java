package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.User;
import com.service.IUserService;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/login.action")
	public String login(String userName, String passWord,HttpSession session) {
		User user = userService.queryByNameAndPassWord(userName,passWord);
		if (user != null) {
			session.setAttribute("user", user);
			return "succeed";
		}
		return "error";
	}
	
	@RequestMapping(value="/register.action")
	public String register(User user,Model model) {
		userService.addUser(user);
		model.addAttribute("msg","注册成功");
		return "msg";
	}
	
	
}
