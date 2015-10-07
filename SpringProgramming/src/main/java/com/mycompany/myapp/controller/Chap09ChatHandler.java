package com.mycompany.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class Chap09ChatHandler extends TextWebSocketHandler{
	private static final Logger logger = LoggerFactory.getLogger(Chap09ChatHandler.class);
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
		TextMessage textMessage=new TextMessage(message.getPayload());
		for(WebSocketSession wss:list){
			synchronized(wss){
				wss.sendMessage(textMessage);
			}
		}
	}
}
