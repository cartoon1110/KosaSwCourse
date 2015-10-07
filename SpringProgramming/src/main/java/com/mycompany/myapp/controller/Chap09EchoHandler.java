package com.mycompany.myapp.controller;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.*;

@Component
public class Chap09EchoHandler extends TextWebSocketHandler{

	
	private static final Logger logger = LoggerFactory.getLogger(Chap09EchoHandler.class);
	//����, ����, ������ ó�����ִ� ���� handler
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		
		logger.info("afterConnectionEstablished");
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		logger.info("afterConnectionEstablished");
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		logger.info("handleTextMessage");
		String strMessage=message.getPayload();
		session.sendMessage(new TextMessage("echo:"+strMessage));
	}
}
