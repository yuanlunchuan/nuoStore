package com.wisesscu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sites")
public class SitesController {
	@RequestMapping("")
	public String index(ModelMap model){
		return "sites/sites";
	}
}
