<%@ page contentType="text/html; charset=UTF-8"%>
<%String username=request.getParameter("username");
String tel="010-8993-1779";



response.sendRedirect("page_control_end.jsp?username="+ username+"&"+"tel="+tel);%>