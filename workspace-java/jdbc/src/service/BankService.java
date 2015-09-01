package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.Account;
import dao.AccountDao;
import dao.ConnectionManager;

public class BankService {
	public void transfer(int from, int to, int amount) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
			conn.setAutoCommit(false); // sql을 실행할때마다 자동으로 커밋 되는 것을 방지

			AccountDao accountDao = new AccountDao(conn);
			//출금작업
			Account fromAccount = accountDao.selectByPk(from);
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			accountDao.update(fromAccount);
			//입금작업
			Account toAccount = accountDao.selectByPk(to);
			toAccount.setBalance(toAccount.getBalance() + amount);
			accountDao.update(toAccount);

			conn.commit();
			System.out.println("계좌 이체 성공");

		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
			}
			System.out.println("계좌 이체 실패");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}
}
