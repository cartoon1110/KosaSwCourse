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
public class Chap07Controller {
	private static final Logger logger = LoggerFactory.getLogger(Chap07Controller.class);
	
	@RequestMapping("/chap07/index")
	public String index() {
		return "chap07/index";
	}
	
	@RequestMapping(value="/chap07/commandObject", method=RequestMethod.GET)
	public String commandObjectGet() {
		return "chap07/writeForm";
	}
	
	@RequestMapping(value="/chap07/commandObject", method=RequestMethod.POST)
	public String commandObjectPost(Board board) {
	//public String commandObjectPost(@ModelAttribute("board") Board board) {
		if(board.getTitle()==null || board.getTitle().equals("")) {
			return "chap07/writeForm";
		}
		if(board.getWriter()==null || board.getWriter().equals("")) {
			return "chap07/writeForm";
		}
		if(board.getContent()==null || board.getContent().equals("")) {
			return "chap07/writeForm";
		}
		
		return "redirect:/board/list";
	}
	
	@ModelAttribute("menuList")
	public List<String> getMenuList() {
		logger.info("getMenuList()");
		List<String> menuList = Arrays.asList("硫붾돱1","硫붾돱2","硫붾돱3","硫붾돱4","硫붾돱5");
		return menuList;
	}
	
	@RequestMapping("/chap07/modelAttribute1")
	public String modelAttribute1() {
		return "chap07/modelAttribute1";
	}
	
	@RequestMapping("/chap07/modelAttribute2")
	public String modelAttribute2() {
		return "chap07/modelAttribute2";
	}	
	
	@RequestMapping("/chap07/cookieValueSet")
	public String cookieValueSet(HttpServletResponse response) {
		Cookie cookie1 = new Cookie("memberId", "white");
		Cookie cookie2 = new Cookie("loginStatus", "ok");
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		return "chap07/cookieValueSet";
	}
	
	@RequestMapping("/chap07/cookieValueGet")
	public String cookieValueGet(
			@CookieValue String memberId, 
			@CookieValue("loginStatus") String status,
			Model model) {
		logger.info("memberId: " + memberId);
		logger.info("loginStatus: " + status);
		model.addAttribute("memberId", memberId);
		model.addAttribute("loginStatus", status);
		return "chap07/cookieValueGet";
	}	
	
	@RequestMapping("/chap07/requestHeader")
	public String requestHeader(@RequestHeader("User-Agent") String userAgent, Model model) {
		model.addAttribute("userAgent", userAgent);
		return "chap07/requestHeader";
	}

	@RequestMapping(value="/chap07/login", method=RequestMethod.GET)
	public String loginForm(Login login) {
		return "chap07/loginForm";
	}
	
	@RequestMapping(value="/chap07/login", method=RequestMethod.POST)
	public String login(Login login, BindingResult bindingResult) {
		new LoginValidator().validate(login, bindingResult);
		if(bindingResult.hasErrors()) {
			return "chap07/loginForm";
		}
	
		return "redirect:/chap07/index";
	}
	
	@RequestMapping(value="/chap07/join", method=RequestMethod.GET)
	public String loginForm(Member member) {
		return "chap07/joinForm";
	}
	
	@RequestMapping(value="/chap07/join", method=RequestMethod.POST)
	public String login(Member member, BindingResult bindingResult) {
		//유효성 검사 작업
		new MemberValidator().validate(member, bindingResult);
		if(bindingResult.hasErrors()){
			return "chap07/joinForm";
		}
		//join작업
	  logger.info(member.getMemberBirthday().toString());
		return "redirect:/chap07/index";
	}
	

	
}