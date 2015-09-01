<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h2>forward, sendRedirect 테스트</h2>
		<hr>
		<form method="post" action="forward_action2.jsp">
			forward action : <input type="text" name="username">
			<input type="submit" value="확인">
		</form>
		
		<form method="post" action="response_sendRedirect.jsp">
			response.sendRedirect : <input type="text" name="username">
			<input type="submit" value="확인">
		</form>
	</body>
</html>