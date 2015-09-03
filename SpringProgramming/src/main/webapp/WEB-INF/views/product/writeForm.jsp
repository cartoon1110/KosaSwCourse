<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			body{
				font-size:small;
			}
			input{
				font-size:12px;
			}
			td{
				color:white;

			}
			table{
				margin:120px;
				border: 1px solid gray;
			}
		</style>
	</head>
	
	<body>
		<form method="post" action="write" enctype="multipart/form-data">
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
				<tr>
					<td>첨부</td>
					<td><input type="file" name="attach"></input>
				
				</tr>
				
				<tr>
					<td colspan="2" style="text-align:center;">
						<br/>
						<input type="submit" value="상품등록"/>
						<input type="reset" value="다시작성"/>
					</td>
				</tr>
			</table>

		</form>
	</body>
</html>
