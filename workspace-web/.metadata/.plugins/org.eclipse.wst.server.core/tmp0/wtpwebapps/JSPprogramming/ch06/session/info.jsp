<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			<h4>새로운 세션인지 조사</h4>
			<%if(session.isNew()) {%>
				처음 접속했구나?
			<%} else{%>
				조금전에 접속했었는데 또 왔구나?
			<% }%>
			
			<h4>세션 ID</h4>
			<%= session.getId() %>
			
			<h4>세션 삭제 시간</h4>
			<%= session.getMaxInactiveInterval() %>
		</body>
	</html>