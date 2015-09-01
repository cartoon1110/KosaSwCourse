<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			remove.jsp
			<hr/>
			<%
			application.removeAttribute("name1");
			application.removeAttribute("name2");
			%>
			애플리케이션을 다 소화시켜버려서 없어
		</body>
	</html>