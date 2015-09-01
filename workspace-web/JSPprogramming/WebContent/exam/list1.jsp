<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*, java.util.*" %>

<%
int pageNo = 1;
String strPageNo = request.getParameter("pageNo");
if(strPageNo != null) {
	//pageNo가 전달되었을 경우
	pageNo = Integer.parseInt(strPageNo);
}
%>

<jsp:useBean 
	id="productService" 
	class="service.ProductService"
	scope="application"/>
	
<%
List<Product> list = productService.getPage(pageNo, productService.getRowsPerPage()); 
%>		

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table {
				width: 100%;
				border-collapse: collapse;
				font-size: small;
			}
			table, th, td {
				border: 1px solid black;
				text-align: center;
			}
			th {
				background-color: orange;
			}
			
			#buttonGroup {
				margin: 10px;
				text-align: center;
			}
			#pager {
				margin-top: 5px;
				text-align: center;
				font-size: small;
			}
		</style>
	</head>
	
	<body>
		<h4>상품 목록</h4>
		
		<table>
			<tr>
				<th style="width:80px">상품번호</th>
				<th>상품이름</th>
				<th style="width:80px">가격</th>
			</tr>
			<%for(Product product : list) {%>
			<tr>
				<td><%=product.getProduct_no()%></td>
				<td><a href="detail1.jsp?product_no=<%=product.getProduct_no()%>"><%=product.getProduct_name()%></a></td>
				<td><%=product.getProduct_price()%></td>
			</tr>
			<%}%>
		</table>
		
		<div id="pager">
			<%
			int groupNo = productService.getGroupNo(pageNo);
			%>
			<a href="list1.jsp?pageNo=1">[처음]</a>
			<%if(groupNo>1) {%>
				<a href="list1.jsp?pageNo=<%=productService.getStartPageNo(groupNo-1)%>">[이전]</a>
			<%}%>
			<%for(int i=productService.getStartPageNo(groupNo); 
				  i<=productService.getEndPageNo(groupNo); 
				  i++) {%>
				<a href="list1.jsp?pageNo=<%=i%>"><%=i%></a> &nbsp;
			<%}%>
			<%if(groupNo<productService.getTotalGroupNo()) {%>
				<a href="list1.jsp?pageNo=<%=productService.getStartPageNo(groupNo+1)%>">[다음]</a>
			<%}%>
			<a href="#">[맨끝]</a>
		</div>
		
		<div id="buttonGroup">
			<a href="write_form1.jsp">
				<img src="../common/images/board/write.gif"/>
			</a>
		</div>
	</body>
</html>