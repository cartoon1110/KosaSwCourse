<%@ page contentType="text/html; charset=UTF-8"%>

<%
String username = request.getParameter("username");
int age = 30;
response.sendRedirect(
	"f.jsp?username=" + username + "&" +
	"age=" + age
);
%>