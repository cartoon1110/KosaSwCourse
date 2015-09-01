package mysns.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	// 데이터베이스 관련 객체 선언
	Statement stmt = null;
	PreparedStatement pstmt = null;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection conn=null;
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://blueskii.iptime.org:3306/team1","team1","123456");
		return conn;
	}
}