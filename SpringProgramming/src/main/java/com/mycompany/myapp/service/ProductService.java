package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.ProductDao;
import com.mycompany.myapp.dto.Product;

@Component
public class ProductService {
	@Autowired
	private ProductDao productDao;
	
	public void add(Product product) {
		productDao.insert(product);
	}
	
	public List<Product> getPage(int pageNo, int rowsPerPage) {
		List<Product> list =productDao.selectByPage(pageNo, rowsPerPage);
		return list;
	}
	
	public Product getProduct(int productNo) {
		Product product = productDao.selectByPk(productNo);
		return product;
	}
	
	public void modify(Product product) {
			productDao.update(product);
	}
	
	public void remove(long productNo) {
		productDao.delete(productNo);
	}
	
	public int getTotalProductNo(){
		int rows=productDao.selectCount();
		return rows;
	}
}
