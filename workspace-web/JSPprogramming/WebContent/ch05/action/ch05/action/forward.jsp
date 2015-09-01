<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*"%>

<%
String email = request.getParameter("email");
String name = "삼겹살";
name = URLEncoder.encode(name, "UTF-8");
%>

<jsp:forward page="forwardForm.jsp">
	<jsp:param value="fall" name="id"/>
	<jsp:param value="<%=name%>" name="name"/>
</jsp:forward>



