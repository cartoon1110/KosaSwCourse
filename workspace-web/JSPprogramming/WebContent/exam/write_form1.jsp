<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form method="post" action="write1.jsp">
			<table id="form_table">
				<tr>
					<td>상품이름</td>
					<td><input type="text" name="product_name"/></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="text" name="product_price"/></td>
				</tr>
				<tr>
					<td>상품정보</td>
					<td><textarea name="product_info" rows="5" cols="50"></textarea></td>
				</tr>
			</table>
			<input type="submit" value="상품등록"/>
			<input type="reset" value="다시작성"/>
		</form>
	</body>
</html>

  
  
  
  
  
  
  