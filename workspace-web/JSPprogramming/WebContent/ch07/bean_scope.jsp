<%@ page contentType="text/html; charset=UTF-8"%>

<!-- 
[빈 사용 범위]
page: 해당 JSP에서만 사용되는 범위(디폴트)
request: forward된 JSP에서도 사용되는 범위
session: 동일한 브라우저에서 사용되는 범위
application: 전체 공유되는 범위
-->

<jsp:useBean id="board1" class="dto.Board" scope="page"/>  
<jsp:useBean id="board2" class="dto.Board" scope="request"/>  
<jsp:useBean id="board3" class="dto.Board" scope="session"/>  
<jsp:useBean id="board4" class="dto.Board" scope="application"/>  

<%
board1.setTitle("board1");
board2.setTitle("board2");
board3.setTitle("board3");
board4.setTitle("board4");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		board1: page 범위 <br/>
		board2: request 범위 <br/>
		board3: session 범위 <br/>
		board4: application 범위 <br/>
		<a href="bean_scope_check.jsp">체크</a>
	</body>
</html>


