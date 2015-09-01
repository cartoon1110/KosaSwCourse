<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>

<%
int boardNo=Integer.parseInt(request.getParameter("board_no"));
%>

<jsp:useBean
	 id="boardService" 
	 class="service.BoardService"
	 scope="application"/>
	 
<% Board board=boardService.getBoard(boardNo); %>	 
	 
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
			<style type="text/css">
				body{
					font-family:"돋움";
					font-size:12px;
				}
				span{
					display:inline-block;
					margin:3px 10px;
					
				}
				
				span.title{
					border:1px solid darkgray;
					background: lightgray;
					width:70px;
					text-align:center;
				}
				
				pre{
					margin:10px;
					border:1px solid darkgray;
					padding:10px;
					width:300px;
					height:100px;
				}
			</style>
		</head>
		<body>
			<h4>게시물 보기</h4>
			
			<span class="title">번호:</span>
			<span class="content"><%=board.getNo() %></span><br/>
			<span class="title">제목:</span>
			<span class="content"><%=board.getTitle() %></span><br/>
			<span class="title">글쓴이:</span>
			<span class="content"><%=board.getWriter() %></span><br/>
			<span class="title">날짜:</span>
			<span class="content"><%=board.getDate() %></span><br/>
			<span class="title">조회수:</span>
			<span class="content"><%=board.getHitcount() %></span><br/>
			<span class="title">내용:</span><br/>
			<pre><%=board.getContent() %><br/></pre>
			
			<div id="buttonGroup">
				<a href="list.jsp">
					<img src="../common/images/board/list.gif"/>
				</a>
				<a href="modify_form.jsp?board_no=<%=board.getNo() %>">
					<img src="../common/images/board/modify.gif"/>
				</a>
				<a href="delete.jsp?board_no=<%=board.getNo()%>">
					<img src="../common/images/board/delete.gif"/>
				</a>
			</div>

		</body>
	</html>