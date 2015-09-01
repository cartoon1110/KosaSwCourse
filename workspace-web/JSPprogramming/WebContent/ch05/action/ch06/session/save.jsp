<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		save.jsp
		<hr/>
		<%
		session.setAttribute("name1", "홍길동");
		session.setAttribute("name2", "seogaram");
		%>
		세션에 잘 저장되었습니다.
	</body>
</html>





