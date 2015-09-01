<%@ page contentType="text/html; charset=UTF-8"%>


<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="product" class="dto.Product">
	<jsp:setProperty name="product" property="*"/>
</jsp:useBean>

<jsp:useBean 
	id="productService" 
	class="service.ProductService"
	scope="application"/><!--어플리케이션에 있으면 가져오고 없으면 생성-->

>	
<%productService.modify(product);%>


<%response.sendRedirect("list1.jsp"); %>
