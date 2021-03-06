package com.wisesscu.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisesscu.entity.Message;
import com.wisesscu.entity.User;

@Controller
@RequestMapping("/msg")
public class MsgController {
	
	Map<Long, User> users = new HashMap<Long, User>();
	
	// 模拟一些数据
	@ModelAttribute
	public void setReqAndRes() {
		User u1 = new User();
		u1.setId(1L);
		u1.setName("张三");
		users.put(u1.getId(), u1);
		
		User u2 = new User();
		u2.setId(2L);
		u2.setName("李四");
		users.put(u2.getId(), u2);
	}
	
	// 用户登录
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView doLogin(User user, HttpServletRequest request) {
		System.out.println("-----------run in post method");
		request.getSession().setAttribute("uid", user.getId());
		request.getSession().setAttribute("name", users.get(user.getId()).getName());
		return new ModelAndView("redirect:/msg/talk");
	}
	
	// 跳转到登陆页面
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView newLoginPage() {
		return new ModelAndView("websocket/login");
	}
	
	// 跳转到交谈聊天页面
	@RequestMapping(value = "/talk", method = RequestMethod.GET)
	public ModelAndView talk() {
		return new ModelAndView("websocket/talk");
	}
	
	// 跳转到发布广播页面
	@RequestMapping(value = "/broadcast", method = RequestMethod.GET)
	public ModelAndView broadcast() {
		return new ModelAndView("websocket/broadcast");
	}
	
	// 发布系统广播（群发）
	@ResponseBody
	@RequestMapping(value = "/broadcast", method = RequestMethod.POST)
	public void broadcast(String text) throws IOException {
		Message msg = new Message();
		msg.setDate(new Date());
		msg.setFrom(-1L);
		msg.setFromName("系统广播");
		msg.setTo(0L);
		msg.setText(text);
	}
}