<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
List<String> list = new ArrayList<String>();
list.add("나의");
list.add("인생");
list.add("성공기");
session.setAttribute("list", list);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<ul>
		<%List<String> list2 = (List<String>)session.getAttribute("list");
		  for(String str : list2) {%>
			<li><%=str%></li>
		<%}%>
		</ul>
		
		<hr/>
		
		<ul>
			<c:forEach var="str" items="${list}">
				<li>${str}</li>
			</c:forEach>
		</ul>
	</body>
</html>


