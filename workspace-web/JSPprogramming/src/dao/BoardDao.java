package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Board;

public class BoardDao {
	private Connection conn;
	
	public BoardDao(Connection conn) {
		this.conn = conn;
	}
	
	public Integer insert(Board board) throws SQLException {
		Integer pk = null;
		String sql = "insert into boards (board_title, board_content, board_writer, "
				+ "board_date, board_original_file_name, board_filesystem_name, "
				+ "board_content_type) values(?, ?, ?, now(), ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"board_no"});
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setString(3, board.getWriter());
		pstmt.setString(4, board.getOriginalFileName());
		pstmt.setString(5, board.getFileSystemName());
		pstmt.setString(6, board.getContentType());
		int rows = pstmt.executeUpdate();
		if(rows==1) {
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		}
		pstmt.close();
		return pk;
	}
	
	public List<Board> selectByPage(int pageNo, int rowsPerPage) throws SQLException {
		List<Board> list = new ArrayList<Board>();
		String sql = "";
		sql += "select board_no, board_title, board_writer, board_date, board_hitcount " ;
		sql += "from boards ";
		sql += "order by board_no desc ";
		sql += "limit ?,?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, (pageNo-1)*rowsPerPage);
		pstmt.setInt(2, rowsPerPage);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Board board = new Board();
			board.setNo(rs.getInt("board_no"));
			board.setTitle(rs.getString("board_title"));
			board.setDate(rs.getDate("board_date"));
			board.setWriter(rs.getString("board_writer"));
			board.setHitcount(rs.getInt("board_hitcount"));
			list.add(board);    
		}
		rs.close();
		pstmt.close();
		
		return list;
	}
	
	public Board selectByPk(int boardNo) throws SQLException {
		Board board = null;
		String sql = "select * from boards where board_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, boardNo);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
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
	
	public int update(Board board) throws SQLException {
		int rows = 0;
		String sql = "update boards set board_title=?, board_content=? where board_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setLong(3, board.getNo());
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}
	
	public int delete(long boardNo) throws SQLException {
		int rows = 0;
		String sql = "delete from boards where board_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, boardNo);
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}
	
	public int updateHitcount(long boardNo) throws SQLException {
		int rows = 0;
		String sql = "update boards set board_hitcount=board_hitcount+1 where board_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, boardNo);
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}	
	
	public int selectCount() throws SQLException {
		int rows = 0;
		String sql = "select count(*) from boards";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			rows = rs.getInt(1);
		}
		rs.close();
		pstmt.close();
		return rows;
	}
}



