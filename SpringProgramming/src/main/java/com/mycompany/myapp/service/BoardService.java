package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.BoardDao;
import com.mycompany.myapp.dto.Board;

@Component
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
	
	public void add(Board board) {
		boardDao.insert(board);
	}
	
	public List<Board> getPage(int pageNo, int rowsPerPage) {
		List<Board> list = boardDao.selectByPage(pageNo, rowsPerPage);
		return list;
	}
	
	public Board getBoard(int boardNo) {
		Board board = boardDao.selectByPk(boardNo);
		return board;
	}
	
	public void modify(Board board) {
		boardDao.update(board);
	}
	
	public void remove(long boardNo) {
		boardDao.delete(boardNo);
	}
	
	public void addHitcount(long boardNo) {
		boardDao.updateHitcount(boardNo);
	}	

	private int rowsPerPage = 10;
	private int pagesPerGroup = 3;
	
	public int getRowsPerPage() { 
		return rowsPerPage; 
	}
	
	public int getGroupNo(int pageNo) {
		return (pageNo-1)/pagesPerGroup + 1;
	}
	
	public int getStartPageNo(int groupNo) {
		return (groupNo-1)*pagesPerGroup + 1;
	}
	public int getEndPageNo(int groupNo) {
		int startPageNo = getStartPageNo(groupNo);
		int totalGroupNo = getTotalGroupNo();
		if(totalGroupNo != groupNo) {
			return startPageNo + pagesPerGroup - 1;
		} else {
			return getTotalPageNo();
		}
	}
	
	public int getTotalPageNo() {
		int totalPageNo = 1;
		int rows = boardDao.selectCount();
		totalPageNo = rows / rowsPerPage;
		if(rows%rowsPerPage != 0) {
			totalPageNo++;
		}
		return totalPageNo;
	}
	
	public int getTotalGroupNo() {
		int totalPageNo = getTotalPageNo();
		int totalGroupNo = totalPageNo / pagesPerGroup;
		if(totalPageNo%pagesPerGroup != 0) {
			totalGroupNo++;
		}
		return totalGroupNo;
	}
}







