package com.wisesscu.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisesscu.socket.NstSocket;

@Controller
@RequestMapping("nstGrades")
public class NstGradesController {

	@RequestMapping("/show")
	public String show(HttpSession session){
		if(null==session.getAttribute("uid")){
			session.setAttribute("uid", UUID.randomUUID().toString());
		}
		return "nstGrades/show";
	}
	
	@RequestMapping("/create")
	public Object create(String uid){
    System.out.println("----------»ñÈ¡µÄuid£º "+uid);
		NstSocket nstSocket = new NstSocket(uid);
		nstSocket.start();

		return "";
	}
}
