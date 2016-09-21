package com.wisesscu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		System.out.println("-------userId: "+userId);
		User user = this.userService.getUserById(userId);
		System.out.println("-----user: "+user.getPassword());
		model.addAttribute("user", user);
		return "showUser";
	}
}
