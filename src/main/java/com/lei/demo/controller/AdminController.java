package com.lei.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admins")

public class AdminController {
  @RequestMapping(method=RequestMethod.GET)
  @ResponseBody
  public String index(){
	  System.out.println("----------run line 14");
	 return "{\"success\":3}";
  }
}
