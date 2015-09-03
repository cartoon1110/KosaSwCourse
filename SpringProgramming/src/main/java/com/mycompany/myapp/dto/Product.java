package com.mycompany.myapp.dto;

public class Product {
	private int product_no;
	private String product_name;
	private int product_price;
	private String product_info;
	private String product_original_file_name;
	private String product_filesystem_name;
	private String product_content_type;
	
	
	public String getProduct_original_file_name() {
		return product_original_file_name;
	}
	public void setProduct_original_file_name(String product_original_file_name) {
		this.product_original_file_name = product_original_file_name;
	}
	public String getProduct_filesystem_name() {
		return product_filesystem_name;
	}
	public void setProduct_filesystem_name(String product_filesystem_name) {
		this.product_filesystem_name = product_filesystem_name;
	}
	public String getProduct_content_type() {
		return product_content_type;
	}
	public void setProduct_content_type(String product_content_type) {
		this.product_content_type = product_content_type;
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_info() {
		return product_info;
	}
	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}

}
