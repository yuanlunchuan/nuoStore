package com.wisesscu.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.socket.TextMessage;

import com.google.gson.GsonBuilder;
import com.wisesscu.entity.Message;
import com.wisesscu.entity.User;
import com.wisesscu.websocket.MyWebSocketHandler;

@Controller
@RequestMapping("/msg")
public class MsgController {
	
	@Autowired
	MyWebSocketHandler	handler;
	
	Map<Long, User>			users	= new HashMap<Long, User>();
	
	// ģ��һЩ����
	@ModelAttribute
	public void setReqAndRes() {
		User u1 = new User();
		u1.setId(1L);
		u1.setName("����");
		users.put(u1.getId(), u1);
		
		User u2 = new User();
		u2.setId(2L);
		u2.setName("����");
		users.put(u2.getId(), u2);
		
	}
	
	// �û���¼
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView doLogin(User user, HttpServletRequest request) {
		request.getSession().setAttribute("uid", user.getId());
		request.getSession().setAttribute("name", users.get(user.getId()).getName());
		return new ModelAndView("redirect:/msg/talk");
	}

	// ��ת����½ҳ��
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView newLoginPage() {
		return new ModelAndView("websocket/login");
	}

	// ��ת����̸����ҳ��
	@RequestMapping(value = "talk", method = RequestMethod.GET)
	public ModelAndView talk() {
		return new ModelAndView("websocket/talk");
	}
	
	// ��ת�������㲥ҳ��
	@RequestMapping(value = "broadcast", method = RequestMethod.GET)
	public ModelAndView broadcast() {
		return new ModelAndView("websocket/broadcast");
	}
	
	// ����ϵͳ�㲥��Ⱥ����
	@ResponseBody
	@RequestMapping(value = "broadcast", method = RequestMethod.POST)
	public void broadcast(String text) throws IOException {
		Message msg = new Message();
		msg.setDate(new Date());
		msg.setFrom(-1L);
		msg.setFromName("ϵͳ�㲥");
		msg.setTo(0L);
		msg.setText(text);
		handler.broadcast(new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(msg)));
	}
}