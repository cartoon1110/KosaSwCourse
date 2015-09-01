package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Product;



public class ProductDao {
	private Connection conn;
	
	public ProductDao(Connection conn) {
		this.conn = conn;
	}
	public Integer insert(Product product) throws SQLException {
		Integer pk = null;
		String sql = "insert into products (product_name, product_price, product_info) values( ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"product_no"});
		pstmt.setString(1, product.getProduct_name());
		pstmt.setInt(2, product.getProduct_price());
		pstmt.setString(3, product.getProduct_info());
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
	
	public List<Product> selectByPage(int pageNo, int rowsPerPage) throws SQLException {
		List<Product> list = new ArrayList<Product>();
		String sql = "";
		sql += "select product_no, product_name, product_price " ;
		sql += "from products ";
		sql += "order by product_no desc ";
		sql += "limit ?,?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, (pageNo-1)*rowsPerPage);
		pstmt.setInt(2, rowsPerPage);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product product = new Product();
			product.setProduct_no(rs.getInt("product_no"));
			product.setProduct_name(rs.getString("product_name"));
			product.setProduct_price(rs.getInt("product_price"));
			list.add(product);    
		}
		rs.close();
		pstmt.close();
		
		return list;
	}
	
	public Product selectByPk(int productNo) throws SQLException {
		Product product = null;
		String sql = "select * from products where product_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			product=new Product();
			product.setProduct_no(rs.getInt("product_no"));
			product.setProduct_name(rs.getString("product_name"));
			product.setProduct_price(rs.getInt("product_price"));
			product.setProduct_info(rs.getString("product_info"));
		}
		rs.close();
		pstmt.close();
		
		return product;
	}
	
	public int update(Product product) throws SQLException {
		int rows = 0;
		String sql = "update products set product_name=?, product_price=?, product_info=? where product_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getProduct_name());
		pstmt.setInt(2, product.getProduct_price());
		pstmt.setString(3, product.getProduct_info());
		pstmt.setLong(4, product.getProduct_no());
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}
	
	public int delete(long productNo) throws SQLException {
		int rows = 0;
		String sql = "delete from products where product_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, productNo);
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}
	
	public int selectCount() throws SQLException {
		int rows = 0;
		String sql = "select count(*) from products";
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
