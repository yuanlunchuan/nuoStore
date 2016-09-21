package com.wisesscu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	@RequestMapping("")
	public String index(ModelMap model){
		return "orders/index";
	}
}
