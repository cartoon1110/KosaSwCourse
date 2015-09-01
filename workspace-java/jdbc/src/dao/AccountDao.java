package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {
	private Connection conn;

	public AccountDao(Connection conn) {
		this.conn = conn;
	}

	public int update(Account account) throws SQLException {
		int rows = 0;
		String sql = "update accounts set account_balance=? where account_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, account.getBalance());
		pstmt.setInt(2, account.getNo());
		rows = pstmt.executeUpdate(); // select만 query임
		return rows;
	}

	public Account selectByPk(int accountNo) throws SQLException {
		Account account = null;
		String sql = "select * from accounts where account_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, accountNo);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			account = new Account();
			account.setNo(rs.getInt("account_no"));
			account.setOwner(rs.getString("account_owner"));
			account.setBalance(rs.getInt("account_balance"));
		}

		return account;
	}
}
