<%@ page contentType="text/html; charset=UTF-8"%>

<%
int no=Integer.parseInt(request.getParameter("no"));
%>




<nav class="menu">
	<%if(no==1) {%>
	
	<div class="menuitem">Menu1</div>
	<%} else if(no==2) {%>
	<div class="menuitem">Menu2</div>
	<%} else if(no==3) {%>
	<div class="menuitem">Menu3</div>
	<%}%>
</nav>
