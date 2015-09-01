package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample2 {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(
					"jdbc:mysql://blueskii.iptime.org:3306/team1", "team1", "123456");
			
			String sql="update user14_board set board_title=?,  board_content=?, board_writer=? where board_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "오늘은 화요일");
			pstmt.setString(2, "매일 일찍가요");
			pstmt.setString(3, "홍");
			pstmt.setInt(4, 1);
			int rows=pstmt.executeUpdate();
			
			System.out.println(rows+"개의 행이 수정됨");			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try { pstmt.close(); }	 catch (SQLException e1) {}
			try { conn.close();	} catch (SQLException e) {}
		}
		

	}

}
