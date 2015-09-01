<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		remove.jsp
		<hr/>
		<%
		session.removeAttribute("name1");
		session.removeAttribute("name2");
		%>
		세션에서 삭제했습니다.
	</body>
</html>