<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>

<%String method = request.getMethod();%>

<%if(method.equals("GET")) {%>
	<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		
		<body>
			<form method="post" action="dto_auto_setting.jsp">
				<table id="form_table">
					<tr>
						<td>제목</td>
						<td><input type="text" name="title"/></td>
					</tr>
					<tr>
						<td>글쓴이</td>
						<td><input type="text" name="writer"/></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><textarea name="content" rows="5" cols="50"></textarea></td>
					</tr>
				</table>
				<input type="submit" value="글올리기"/>
				<input type="image" src="../common/images/board/write.gif"/>
				<input type="reset" value="다시작성"/>
			</form>
		</body>
	</html>
<%} else if(method.equals("POST")) {%>
	 <%
	 Board board1 = new Board();
	 board1.setTitle(request.getParameter("title"));
	 board1.setWriter(request.getParameter("writer"));
	 board1.setContent(request.getParameter("content"));
	 %>
	 
	 <jsp:useBean id="board2" class="dto.Board">
	 	<jsp:setProperty name="board2" property="*"/>
	 </jsp:useBean>
	 
	 title: <%=board1.getTitle()%> <br/>
	 writer: <%=board1.getWriter()%> <br/>
	 content: <%=board1.getContent()%> <br/>
	 
	 title: <%=board2.getTitle()%> <br/>
	 writer: <%=board2.getWriter()%> <br/>
	 content: <%=board2.getContent()%> <br/>
<%}%>
  
  
  
  
  
  
  