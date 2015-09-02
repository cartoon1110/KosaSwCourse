package com.mycompany.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.dto.Board;
import com.mycompany.myapp.dto.Product;
import com.mycompany.myapp.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product/list")
	public String list(HttpServletRequest request){
		List<Product> list=productService.getPage(1, 10);
		request.setAttribute("list", list);
		return "product/list";
	}
	
	@RequestMapping("/product/writeForm")
	public String writeForm(){
		return "product/writeForm";
	}
	
	@RequestMapping("/product/updateForm")
	public String updateForm(){
		return "product/updateForm";
	}
	
	@RequestMapping("/product/write")
	public String write(String product_name, int product_price, String product_info){
		Product product=new Product();
		product.setProduct_name(product_name);;
		product.setProduct_price(product_price);;
		product.setProduct_info(product_info);;
		productService.add(product);
		return "redirect:/product/list";
	}
	
	@RequestMapping("/product/update")
	public String update(){
		return "redirect:/product/list";
	}
}
