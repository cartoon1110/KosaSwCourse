<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>

<%
Board board1 = new Board();
board1.setTitle("오늘은 일찍 가는 날1");
board1.setContent("복습 해야지1");
%>

<jsp:useBean id="board2" class="dto.Board"/>
<jsp:setProperty name="board2" property="title" value="오늘은 일찍 가는 날2"/>
<jsp:setProperty name="board2" property="content" value="복습 해야지2"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		board1-title: <%=board1.getTitle()%> <br/>
		board1-content: <%=board1.getContent()%> <br/>
		board2-title: <jsp:getProperty name="board2" property="title" /> <br/>
		board2-content: <jsp:getProperty name="board2" property="content" /> <br/>
	</body>
</html>