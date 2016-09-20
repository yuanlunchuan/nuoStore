package com.wisesscu.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cases")
public class CasesController {
	@RequestMapping("")
	public String index(ModelMap model) {

		model.addAttribute("message", "Spring3 MVC 例子");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		model.addAttribute("date", dateFormat.format(new java.util.Date()));

		return "cases/index";
	}
}
