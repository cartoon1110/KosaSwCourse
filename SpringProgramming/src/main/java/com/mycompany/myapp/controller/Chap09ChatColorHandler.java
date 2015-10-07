package com.mycompany.myapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class Chap09ChatColorHandler extends TextWebSocketHandler{
	private static final Logger logger = LoggerFactory.getLogger(Chap09ChatColorHandler.class);
	private List<WebSocketSession> list=new ArrayList<WebSocketSession>();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.info("afterConnectionEstablished");
		list.add(session);
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		logger.info("afterConnectionEstablished");
		list.remove(session);
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		logger.info("handleTextMessage");
		String strJson=message.getPayload();
		JSONObject jsonObject=new JSONObject(strJson);
		
		String command=jsonObject.getString("command");
		JSONObject data=jsonObject.getJSONObject("data");
		if(command.equals("broadcast")){
			broadcast(data);
		}/*else if(command.equals("login")){
			login(data);
		}*/
		
	}
	
	/*private void login(JSONObject data){}
	*/
	private void broadcast(JSONObject data) throws IOException{
		String chatName=data.getString("chatName");
		String fontColor=data.getString("fontColor");
		String message=data.getString("message");
		/*
			  { 
			 	"command" : "display",
			 	"data" : {
			 		"fontColor":"#ff0000",
			 		"message":"[홍길동] 안녕하삼"
			  }
		 */

		JSONObject root=new JSONObject();
		root.put("command", "disply");
		JSONObject d=new JSONObject();
		d.put("fontcolor",fontColor);
		d.put("message", "["+chatName+"] "+message);
		root.put("data", d);
		
		String strJson=root.toString();
		
		TextMessage textMessage=new TextMessage(strJson);
		for(WebSocketSession wss:list){
			synchronized(wss){
				wss.sendMessage(textMessage);
			}
		}
		
	}
}
