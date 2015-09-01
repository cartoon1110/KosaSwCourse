<%@ page contentType="text/html; charset=UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");
String title=request.getParameter("title");
String username = request.getParameter("username");
String contents = request.getParameter("contents");
String males=request.getParameter("males");
String password=request.getParameter("password");
String open=request.getParameter("open");

System.out.println(title);
System.out.println(username);
System.out.println(contents);
System.out.println(males);
System.out.println(password);
System.out.println(open);

%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		title:<%=title %><br/>
		username:<%=username %><br/>
		contents:<%=contents %><br/>
		males: <%=males %><br/>
		password:<%=password %><br/>
		open:<%=open %><br/>
	</body>
</html>