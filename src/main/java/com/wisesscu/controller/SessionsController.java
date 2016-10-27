package com.wisesscu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Controller
@RequestMapping("/sessions")
public class SessionsController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/new")
	public String newPage() {
		return "sessions/new";
	}
	
	@RequestMapping("/")
	public String create(User user, HttpSession httpSession) {
		List<User> users = new ArrayList<User>();
		users = this.userService.find(user);

		if (user != null) {
			httpSession.setAttribute("userId", user.getId());
			return "redirect:/sites";
		} else {
			return "redirect:/sessions/new";
		}
	}
}
