package com.mycompany.myapp.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.dto.Board;

@Controller
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
		List<String> menuList = Arrays.asList("메뉴1","메뉴2","메뉴3","메뉴4","메뉴5");
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
	
	@RequestMapping("/chap7/cookieValueSet")
	public String cookieValueSet(HttpServletResponse response){
		Cookie cookie1=new Cookie("memberId","white");
		Cookie cookie2=new Cookie("loginStatus", "ok");
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		return "chap07/cookieValueSet";
	}
	
	/*답장: 안뇽 성혀나 넌 어디에 가는거닝?*/
	/* 나는 아메리카노가 좋아 뀨뀨뀨뀨*/
	/* 너는 메이플 피칸을 좋아하니? */
	/* 너가 오기 전에 나는 이만 */
	/* 가겠다!! */
	
	@RequestMapping("/chap07/cookieValueGet")
	public String cookieValueGet(@CookieValue String memberId, @CookieValue("loginStatus") String status, Model model){
		model.addAttribute("memberId",memberId);
		model.addAttribute("loginStatus",status);
		return "chap07/cookieValueGet";
	}
	
	
	@RequestMapping("/chap07/requestHeader")
	/* RequestHeader에 User-Agent에 있는 값을 userAgent변수에 넣는다 */
	public String requestHeader(@RequestHeader("User-Agent") String userAgent, Model model){
		model.addAttribute("userAgent", userAgent);
		return "chap07/requestHeader";
	}
	
}



