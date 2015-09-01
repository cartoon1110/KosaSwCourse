<%@ page contentType="text/html; charset=UTF-8"%>


<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="product" class="dto.Product">
	<jsp:setProperty name="product" property="*"/>
</jsp:useBean>


<jsp:useBean 
	id="productService" 
	class="service.ProductService"
	scope="application"/>


<%productService.add(product);%>

<%response.sendRedirect("list1.jsp"); %>
