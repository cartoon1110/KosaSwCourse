<%@ page contentType="text/html; charset=UTF-8"%>

<%
String username = request.getParameter("username");
int age = Integer.parseInt(request.getParameter("age"));
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		f.jsp
		<hr/>
		username: <%=username %> <br/>
		age: <%=age%> <br/>
	</body>
</html>