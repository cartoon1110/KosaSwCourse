package com.mycompany.myapp.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.myapp.ApplicationContextLoader;
import com.mycompany.myapp.dto.Board;


public class BoardDaoTest extends ApplicationContextLoader  {
	
	@Autowired
	private BoardDao boardDao;
	
	@Test
	public void testInsert() {
		Board board = new Board();
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("굴쓴이1");
		Integer bno = boardDao.insert(board);
		Assert.assertNotNull(bno);
	}
	
	@Test
	public void testSelectByPage() {
		List<Board> list = boardDao.selectByPage(1, 10);
		Assert.assertEquals(10, list.size());
	}
	
	@Test
	public void testDelete() {
		Board board = new Board();
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("굴쓴이1");
		Integer bno = boardDao.insert(board);
		int row = boardDao.delete(bno);
		Assert.assertEquals(1, row);
	}
	
	@Test
	public void testUpdate() {
		Board board = new Board();
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("굴쓴이1");
		Integer bno = boardDao.insert(board);
		
		board.setNo(bno);
		board.setTitle("제목2");
		board.setContent("내용2");
		
		int row = boardDao.update(board);
		Assert.assertEquals(1, row);
		
		Board board2 = boardDao.selectByPk(bno);
		Assert.assertEquals(board.getTitle(), board2.getTitle());
		Assert.assertEquals(board.getContent(), board2.getContent());
	}
	
}
