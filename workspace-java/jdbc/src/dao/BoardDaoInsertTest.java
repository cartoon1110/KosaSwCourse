package dao;

import java.sql.Connection;

public class BoardDaoInsertTest {

	public static void main(String[] args) throws Exception {

		Board board = new Board();
		board.setTitle("d");
		board.setContent("d");
		board.setWriter("d");

		Connection conn = ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		Integer pk = boardDao.insert(board);
		if (pk != null) {
			System.out.println(pk + "이 저장됨");
		} else {
			System.out.println("저장실패");
		}
	}

}
