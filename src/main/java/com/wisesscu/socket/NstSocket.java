package com.wisesscu.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.wisesscu.websocket.MyWebSocketHandler;

public class NstSocket extends Thread {
	private String uid;
	Socket server ;

  @Override
	public void run() {
		super.run();
		readData();
	}

	public void readData(){
			try {
				System.out.println("-------开始读取数据");
				server = new Socket(InetAddress.getLocalHost(), 5678);
				BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));

				PrintWriter out = new PrintWriter(server.getOutputStream());
				BufferedReader wt = new BufferedReader(new InputStreamReader(System.in));

				while (true) {
					String str = wt.readLine();
					out.println("-----nstContrller: "+str);
					out.flush();
					if (str.equals("end")) {
						break;
					}

					WebSocketSession webSocketSession = MyWebSocketHandler.userSocketSessionMap.get(uid);
					sendMessageToUser(webSocketSession, new TextMessage(in.readLine()));
					System.out.println("------获取到服务器端的数据： "+in.readLine());
				}

				server.close();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
  }
	
	public void sendMessageToUser(WebSocketSession session, TextMessage message) throws IOException {
		if (session != null && session.isOpen()) {
			session.sendMessage(message);
		}
	}

  public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public NstSocket(String uid){
		this.uid = uid;
	}

}
