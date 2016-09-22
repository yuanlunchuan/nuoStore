package com.wisesscu.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String create(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		ArrayList<User> users = new ArrayList<User>();
		users = this.userService.getUserByName(userName);
		if (users.size() > 0) {
			return "redirect:/users/";
		} else {
			return "redirect:/sessions/new";
		}
	}
}
