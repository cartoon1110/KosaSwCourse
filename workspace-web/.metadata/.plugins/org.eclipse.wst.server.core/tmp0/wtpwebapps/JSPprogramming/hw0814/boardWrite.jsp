<%@ page contentType="text/html; charset=UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String title=request.getParameter("title");
String writer=request.getParameter("writer");
String context=request.getParameter("context");
String 성별=request.getParameter("성별");
String password=request.getParameter("password");
String secret=request.getParameter("secret");


%>


<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			제목: <%= title %><br/>
			글쓴이: <%= writer %><br/>
			내용:<%= context %><br/>
			성별: <%= 성별 %><br/>
			비밀번호: <%= password %><br/>
			공개여부: <%= secret %><br/>
			
		</body>
	</html>