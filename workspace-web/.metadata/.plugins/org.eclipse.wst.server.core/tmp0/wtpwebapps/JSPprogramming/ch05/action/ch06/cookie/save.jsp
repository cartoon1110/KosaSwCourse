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
		String name1 = URLEncoder.encode("홍길동", "UTF-8");
		Cookie cookie1 = new Cookie("name1", name1);
		response.addCookie(cookie1);
		
		Cookie cookie2 = new Cookie("name2", "seogaram");
		cookie2.setMaxAge(365*24*60*60);
		response.addCookie(cookie2);
		%>
		쿠기가 잘 저장되었습니다.
	</body>
</html>





