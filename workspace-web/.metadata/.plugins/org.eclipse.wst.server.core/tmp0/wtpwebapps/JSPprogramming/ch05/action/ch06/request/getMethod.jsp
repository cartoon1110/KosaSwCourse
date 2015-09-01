<%@ page contentType="text/html; charset=UTF-8"%>

<%String method = request.getMethod();%>
<%if(method.equals("GET")) {%>
	양식을 보냅니다.
<%} else if(method.equals("POST")) {%>
	데이터를 받아서 처리합니다. <br/>
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	%>
	id: <%=id%> <br/>
	name: <%=name%> <br/>
<%}%>
