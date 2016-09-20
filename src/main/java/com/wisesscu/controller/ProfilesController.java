package com.wisesscu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfilesController {
	@RequestMapping("")
	public String show(ModelMap model){
		return "profiles/show";
	}
}
