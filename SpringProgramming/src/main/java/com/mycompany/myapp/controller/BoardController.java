package com.mycompany.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.dto.Board;
import com.mycompany.myapp.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/list")
	public String list(HttpServletRequest request){
		List<Board> list=boardService.getPage(1, 10);
		request.setAttribute("list", list);
		
		return "board/list";
	}
	
	@RequestMapping("/board/writeForm")
	public String writeForm(){
		return "board/writeForm";
	}
	
	@RequestMapping("/board/updateForm")
	public String updateForm(){
		return "board/updateForm";
	}
	
	@RequestMapping("/board/write")
	public String write(String title, String writer, String content){
		Board board=new Board();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);
		boardService.add(board);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/board/update")
	public String update(){
		return "redirect:/board/list";
	}
}
