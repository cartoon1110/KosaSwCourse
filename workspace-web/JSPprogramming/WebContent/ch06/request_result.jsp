<%@ page contentType="text/html; charset=UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");
String username = request.getParameter("username");
String job = request.getParameter("job");
String[] favorite = request.getParameterValues("favorite");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		username: <%=username%> <br/>
		job: <%=job%> <br/>
		favorite: 
			<%for(String f : favorite) {%>
				<%=f%>,
			<%}%>
	</body>
</html>