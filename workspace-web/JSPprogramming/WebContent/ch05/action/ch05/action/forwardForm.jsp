<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*" %>

<%
String email = request.getParameter("email");
String id = request.getParameter("id");
String name = request.getParameter("name");
name = URLDecoder.decode(name, "UTF-8");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		forwardForm.jsp
		<hr/>
		
		<form>
			ID: <%=id%> <br/>
			Name: <%=name%> <br/>
			Email: <%=email%> <br/>
		</form>
	</body>
</html>