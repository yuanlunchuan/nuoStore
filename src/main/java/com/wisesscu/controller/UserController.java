package com.wisesscu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/new")
	public ModelAndView newPage(ModelMap model) {
		return new ModelAndView("users/new");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView create(@RequestParam("userName") String userName, @RequestParam("password") String password,
	    @RequestParam("age") int age, ModelMap model) {
		System.out.println("-------------开始创建新用户： ");
		model.addAttribute("userName", userName);
		return new ModelAndView("redirect:/users/");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(ModelMap model) {
		List<User> users = new ArrayList<User>();
		users = this.userService.all();
		model.addAttribute("users", users);
		return new ModelAndView("users/index");
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = this.userService.all();
		if (users.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public ModelAndView show(ModelMap model, @PathVariable int userId) {
		User user = new User();
		user.setId(userId);
		model.addAttribute("user", this.userService.find(user));
		
		return new ModelAndView("users/show");
	}
	
	@RequestMapping(value = "/{userId}/edit", method = RequestMethod.GET)
	public ModelAndView edit(ModelMap model, @PathVariable int userId) {
		User user = new User();
		user.setId(userId);
		model.addAttribute("user", this.userService.find(user));
		return new ModelAndView("users/edit");
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.POST, params = "_method=DELETE")
	public ModelAndView destroy(ModelMap model, @PathVariable int userId) {
		User user = new User();
		user.setId(userId);
		this.userService.destroy(user);
		return new ModelAndView("redirect:/users/");
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.POST)
	public ModelAndView update(ModelMap model, @PathVariable int userId, @RequestParam("userName") String userName,
	    @RequestParam("age") int age) {
		User user = new User();
		user.setId(userId);
		this.userService.update(user);
		return new ModelAndView("redirect:/users/");
	}
}
