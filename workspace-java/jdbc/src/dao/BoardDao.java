package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private Connection conn;

	// 생성자 주입 방식
	public BoardDao(Connection conn) {
		this.conn = conn;
	}

	// 데이터 작업 메소드
	public Integer insert(Board board) throws SQLException {
		Integer pk = null;
		String sql = "insert into boards (board_title, board_content, board_writer) values (?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "board_no" });

		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setString(3, board.getWriter());
		int row = pstmt.executeUpdate();
		if (row == 1) {
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		}
		pstmt.close();
		return pk;
	}

	public int update(Board board) throws SQLException {
		int rows = 0;
		String sql = "update boards set board_title=?, board_content=?, board_hitcount=? where board_no=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setInt(3, board.getHitcount());
		pstmt.setInt(4, board.getNo());

		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}

	public int delete(int boardNo) throws SQLException {
		int rows = 0;
		String sql = "delete from boards where board_no=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, boardNo);
		rows = pstmt.executeUpdate();

		pstmt.close();
		return rows;
	}

	public Board selectByPk(int boardNo) throws SQLException {
		Board board = null;
		String sql = "select * from boards where board_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, boardNo);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			board = new Board();
			board.setNo(rs.getInt("board_no"));
			board.setTitle(rs.getString("board_title"));
			board.setContent(rs.getString("board_content"));
			board.setDate(rs.getDate("board_date"));
			board.setWriter(rs.getString("board_writer"));
			board.setHitcount(rs.getInt("board_hitcount"));
		}

		rs.close();
		pstmt.close();
		return board;
	}

	public List<Board> selectByPage(int pageNo, int rowsPerPage) throws SQLException {
		List<Board> list = new ArrayList<Board>();
		String sql = "";
		sql += "select rn, board_no, board_title, board_writer, board_date, board_hitcount ";
		sql += "from ";
		sql += "( ";
		sql += "select rownum as rn, board_no, board_title, board_writer, board_date, board_hitcount ";
		sql += "from ";
		sql += "( ";
		sql += "select board_no, board_title, board_writer, board_date, board_hitcount ";
		sql += "from boards ";
		sql += "order by board_no desc ";
		sql += ") ";
		sql += "where rownum<=? ";
		sql += ") where rn>=? ";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pageNo * rowsPerPage);
		pstmt.setInt(2, (pageNo - 1) * rowsPerPage + 1);

		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Board board = new Board();
			board.setNo(rs.getInt("board_no"));
			board.setTitle(rs.getString("board_title"));
			board.setDate(rs.getDate("board_date"));
			board.setWriter(rs.getString("board_writer"));
			board.setHitcount(rs.getInt("board_hitcount"));
		}
		rs.close();

		pstmt.close();
		return list;
	}
}
