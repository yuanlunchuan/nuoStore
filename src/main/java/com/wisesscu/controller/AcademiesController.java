package com.wisesscu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/academies")
public class AcademiesController {
	@RequestMapping("")
	public String index(ModelMap model) {
		return "academies/index";
	}
        
        @RequestMapping("new")
        public String newPage(ModelMap model){
               return "academies/new";
        }
}
