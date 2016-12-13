package com.wisesscu.websocket;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

/**
 * Socket�������ӣ����֣��ͶϿ�
 * 
 * @author Goofy
 * @Date 2015��6��11�� ����2:23:09
 */
public class HandShake implements HandshakeInterceptor {
	
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
	    Map<String, Object> attributes) throws Exception {
		
		if (request instanceof ServletServerHttpRequest) {
			HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
			String uid = ((ServletServerHttpRequest) request).getServletRequest().getParameter("uid");
			
			attributes.put("uid", uid);
			servletRequest.getSession().setAttribute("uid", uid);
		}
		return true;
	}
	
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
	    Exception exception) {
	}
	
}