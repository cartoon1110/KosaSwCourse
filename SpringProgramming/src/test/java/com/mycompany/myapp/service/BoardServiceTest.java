package com.mycompany.myapp.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.myapp.ApplicationContextLoader;
import com.mycompany.myapp.dto.Board;

public class BoardServiceTest extends ApplicationContextLoader {
	
	@Autowired
	private BoardService boardService;
	
	@Test
	public void testAdd() {
		Board board = new Board();
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("굴쓴이1");
		boardService.add(board);
	}
	
}
