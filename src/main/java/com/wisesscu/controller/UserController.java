package com.wisesscu.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}

	@RequestMapping("/new")
	public String newPage(ModelMap model){
		return "users/new";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String create(@RequestParam("userName") String userName, 
			@RequestParam("password") String password,
			@RequestParam("age") int age,
			ModelMap model){

		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setAge(age);
		this.userService.save(user);
		model.addAttribute("userName", userName);

		return "redirect:/users/";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model){
		ArrayList<User> users = new ArrayList<User>();
		users = this.userService.all();
		model.addAttribute("users", users);
		return "users/index";
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public String show(ModelMap model, @PathVariable String userId){
		model.addAttribute("user", this.userService.getUserById(Integer.parseInt(userId)));
		return "users/show";
	}

	@RequestMapping(value="/{userId}/edit", method=RequestMethod.GET)
	public String edit(ModelMap model, @PathVariable String userId){
        model.addAttribute("user", this.userService.getUserById(Integer.parseInt(userId)));
		return "users/edit";
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.POST, params = "_method=DELETE")
	public String destroy(ModelMap model,
			@PathVariable String userId){
		this.userService.destroy(Integer.parseInt(userId));
		return "redirect:/users/";
	}

	@RequestMapping(value="/{userId}", method=RequestMethod.POST)
	public String update(ModelMap model,
			@PathVariable int userId,
			@RequestParam("userName") String userName,
			@RequestParam("age") int age){
		User user = new User();
		user.setAge(age);
		user.setUserName(userName);
		user.setId(userId);
		this.userService.update(user);
		return "redirect:/users/";
	}
}
