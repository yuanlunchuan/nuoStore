package com.wisesscu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Controller
@RequestMapping("/sites")
public class SitesController {
	@Autowired
	private IUserService userService;

	@RequestMapping("")
	public String index(ModelMap model, HttpSession httpSession){
		int userId = (Integer) httpSession.getAttribute("userId");
		User user = new User();
		user.setId(userId);
		List<User> users = this.userService.find(user);
		model.addAttribute("user", users.get(0));

		return "sites/sites";
	}
}
