package com.wisesscu.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("nstGrades")
public class NstGradesController {

	@RequestMapping("/show")
	public String show(HttpSession session){
		if(null==session.getAttribute("uid")){
			session.setAttribute("uid", UUID.randomUUID());
		}
		return "nstGrades/show";
	}
}
