<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>

<%
int productNo=Integer.parseInt(request.getParameter("product_no"));
%>

<jsp:useBean
	 id="productService" 
	 class="service.ProductService"
	 scope="application"/>
	 
<% Product product=productService.getProduct(productNo); %>	 
	 
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
			<style type="text/css">
				body{
					font-family:"돋움";
					font-size:12px;
				}
				span{
					display:inline-block;
					margin:3px 10px;
					
				}
				
				span.title{
					border:1px solid darkgray;
					background: lightgray;
					width:70px;
					text-align:center;
				}
				
				pre{
					margin:10px;
					border:1px solid darkgray;
					padding:10px;
					width:300px;
					height:100px;
					font-size:12px;
					
				}
				
			</style>
			<script type="text/javascript">
				function sendData(){
					//값의 유효성 검사
					var modifyForm=document.modifyForm;
					console.log(modifyForm);
					
					var product_name=document.modifyForm.product_name;
					console.log(title);
					
					var product_info=document.modifyForm.product_info;
					var product_price=document.modifyForm.product_price;
					
					if(product_name.value==""||product_info.value==""||product_price.value==""){
						alert("모두 채우세요.");
						return;
					}
					//서버로 전송
					modifyForm.submit();
				}
			</script>
		</head>
		<body>
			<h4>게시물 보기</h4>
			<form id="modifyForm" name="modifyForm" method="post" action="modify1.jsp">
				<span class="title">상품번호:</span>
				<span class="content"><%=product.getProduct_no() %></span>
				<input type="hidden" name="product_no" value="<%=product.getProduct_no()%>" /><br/>
				<span class="title">상품이름:</span>
				<input id="title" type="text" name="product_name" value="<%=product.getProduct_name() %>"/><br/>
				<span class="title">상품가격:</span>
				<input id="title" type="text" name="product_price" value="<%=product.getProduct_price() %>"/><br/>
				<span class="title">상품설명:</span><br/>
				<textarea name="product_info" cols="30" rows="5"><%=product.getProduct_info() %></textarea>
			</form>
			<div id="buttonGroup">
				<a href="javascript:sendData()">[수정]</a>
				<a href="detail1.jsp?product_no=<%=product.getProduct_no()%>">[취소]</a>
			</div>

		</body>
	</html>