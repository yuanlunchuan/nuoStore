package com.wisesscu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@RequestMapping(value="", method=RequestMethod.GET)
	public ModelAndView index(){
		return new ModelAndView("goods/index");
	}

	@RequestMapping(value="/{goodId}", method=RequestMethod.GET)
	public ModelAndView show(@PathVariable int goodId, ModelMap model){
		return new ModelAndView("goods/show");
	}
}
