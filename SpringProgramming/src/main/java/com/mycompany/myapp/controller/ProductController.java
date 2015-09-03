package com.mycompany.myapp.controller;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.myapp.dto.Product;
import com.mycompany.myapp.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product/list")
	public String list(@RequestParam(defaultValue="1") int pageNo, Model model){
		int rowsPerPage=10;
		int pagesPerGroup=5;
		
		//전체 게시물 수
		int totalProductNo=productService.getTotalProductNo();
		
		//전체 페이지 수
		int totalPageNo=totalProductNo/rowsPerPage;
		if(totalProductNo%rowsPerPage!=0){totalPageNo++;}
		
		//전체 그룹 수
		int totalGroupNo=totalPageNo/pagesPerGroup;
		if(totalPageNo%pagesPerGroup!=0){totalGroupNo++;}
		
		//현재 그룹 번호, 시작페이지 번호, 끝페이지번호
		int groupNo=(pageNo-1)/pagesPerGroup+1;
		int startPageNo=(groupNo-1)*pagesPerGroup+1;
		int endPageNo=startPageNo+pagesPerGroup-1;
		if(groupNo==totalGroupNo){endPageNo=totalPageNo;}
		
		List<Product> list=productService.getPage(pageNo, rowsPerPage);
		model.addAttribute("pagesPerGroup", pagesPerGroup);
		model.addAttribute("totalPageNo", totalPageNo);
		model.addAttribute("totalGroupNo", totalGroupNo);
		model.addAttribute("groupNo", groupNo);
		model.addAttribute("startPageNo", startPageNo);
		model.addAttribute("endPageNo", endPageNo);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("list", list);

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
	public String write(String product_name, int product_price, String product_info, MultipartFile attach, HttpSession session){
		
		
		ServletContext application = session.getServletContext();
		String dirPath=application.getRealPath("/resources/uploadfiles");
		String originalFileName=attach.getOriginalFilename();
		String filesystemName=System.currentTimeMillis()+"-"+originalFileName;
		String contentType=attach.getContentType();
		
		if(!attach.isEmpty()){
		// 파일에 저장하기
			try {
				attach.transferTo(new File(dirPath+"/"+filesystemName));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		Product product=new Product();
		product.setProduct_name(product_name);
		product.setProduct_price(product_price);
		product.setProduct_info(product_info);
		
		if(!attach.isEmpty()){
			product.setProduct_original_file_name(originalFileName);
			product.setProduct_filesystem_name(filesystemName);
			product.setProduct_content_type(contentType);
		}
		productService.add(product);
		return "redirect:/product/list";
	}
	
	@RequestMapping("/product/update")
	public String update(){
		return "redirect:/product/list";
	}
	
	@RequestMapping("/product/detail")
	public String detail(int productNo, Model model){
		Product product=productService.getProduct(productNo);
		model.addAttribute("product", product);
		
		return "product/detail";
		
	}
}
