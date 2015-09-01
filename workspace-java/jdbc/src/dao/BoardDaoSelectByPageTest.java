package dao;

import java.sql.Connection;
import java.util.List;

public class BoardDaoSelectByPageTest {

	public static void main(String[] args) throws Exception {
		
		Connection conn=ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		List<Board> list = boardDao.selectByPage(1, 10);

		for (Board board : list) {
			System.out.println(board.getNo()+"\t");
			System.out.println(board.getTitle()+"\t");
			System.out.println(board.getDate()+"\t");
			System.out.println(board.getWriter()+"\t");
			System.out.println(board.getHitcount()+"\t");
		}
	}

}
