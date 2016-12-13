package com.wisesscu.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.wisesscu.websocket.MyWebSocketHandler;

@Controller
@RequestMapping("/monitor")
public class MonitorsController {
	@RequestMapping("/new")
	public String newMonitorPage(){
		return "monitor/newPage";
	}

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Object create(String uid, String text){
		System.out.println("-------服务器接收到的数据： "+text);
		Map<String, String> result = new HashMap<String, String>();

		result.put("uid", uid);
		result.put("text", text);

		WebSocketSession webSocketSession = MyWebSocketHandler.userSocketSessionMap.get(uid);
		try {
			sendMessageToUser(webSocketSession, new TextMessage(text));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	public void sendMessageToUser(WebSocketSession session, TextMessage message) throws IOException {
		if (session != null && session.isOpen()) {
			session.sendMessage(message);
		}
	}

}
