package com.lei.demo.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Spring3 MVC 例子");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "hello";
    }

    @RequestMapping(value="/users", method=RequestMethod.GET)
    @ResponseBody
    public String getAllUser() {
      return "{\"success\":1}";
    }

    @RequestMapping(value="/users", method=RequestMethod.POST)
    @ResponseBody
    public String create(){
    	return "{\"success\":2}";
    }
}
