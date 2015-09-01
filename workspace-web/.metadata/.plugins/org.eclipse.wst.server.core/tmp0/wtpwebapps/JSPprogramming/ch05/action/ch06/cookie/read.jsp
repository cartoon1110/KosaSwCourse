<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		read.jsp
		<hr/>
		<%Cookie[] cookies = request.getCookies();
		  for(Cookie cookie : cookies) {
			 String name = cookie.getName();
			 String value = cookie.getValue();
			 value = URLDecoder.decode(value, "UTF-8");%>
			 <%=name%> : <%=value%> <br/>
		<%}%>
	</body>
</html>