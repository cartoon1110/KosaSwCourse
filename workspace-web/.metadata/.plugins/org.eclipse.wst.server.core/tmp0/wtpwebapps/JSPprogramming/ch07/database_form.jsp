<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form method="post" action="database.jsp">
			<table id="form_table">
				<tr>
					<td>제목</td>
					<td><input type="text" name="title"/></td>
				</tr>
				<tr>
					<td>글쓴이</td>
					<td><input type="text" name="writer"/></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea name="content" rows="5" cols="50"></textarea></td>
				</tr>
			</table>
			<input type="submit" value="글올리기"/>
			<input type="reset" value="다시작성"/>
		</form>
	</body>
</html>

  
  
  
  
  
  
  