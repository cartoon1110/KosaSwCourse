<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			지금 보이는 화면은 page_control_end.jsp에서 출력한 결과입니다.
			<hr>
			이름: <%=request.getParameter("username") %><br>
			전화번호: <%=request.getParameter("tel") %>
		</body>
	</html>