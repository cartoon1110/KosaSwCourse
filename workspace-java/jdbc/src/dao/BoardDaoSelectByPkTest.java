package dao;

import java.sql.Connection;

public class BoardDaoSelectByPkTest {

	public static void main(String[] args) throws Exception{
		
		Connection conn=ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		Board board = boardDao.selectByPk(60);
		if(board != null) {
			System.out.println(board.getNo());
			System.out.println( board.getTitle());
			System.out.println( board.getContent());
			System.out.println( board.getDate());
			System.out.println( board.getWriter());
			System.out.println( board.getHitcount());
		} else {
			System.out.println(60 + "번이 없음");
		}
	}

}
