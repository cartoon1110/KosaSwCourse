package com.mycompany.myapp.controller;

import java.util.*;

import javax.servlet.http.*;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import com.mycompany.myapp.dto.*;

@Controller
//@SessionAttributes("board") 를 넣으면 board는 session범위에 저장된다.
public class Chap09Controller {
	private static final Logger logger = LoggerFactory.getLogger(Chap09Controller.class);
	
	@RequestMapping("/chap09/index")
	public String index() {
		return "chap09/index";
	}
	
	@RequestMapping("/chap09/echo")
	public String echo() {
		return "chap09/echo";
	}
		
	@RequestMapping("/chap09/chat")
	public String chat() {
		return "chap09/chat";
	}
	
	@RequestMapping("/chap09/chatColor")
	public String chatColor(){
		return "chap09/chatColor";
	}
	
	@RequestMapping("/chap09/chatGroup")
	public String chatGroup(){
		return "chap09/chatGroup";
	}
}