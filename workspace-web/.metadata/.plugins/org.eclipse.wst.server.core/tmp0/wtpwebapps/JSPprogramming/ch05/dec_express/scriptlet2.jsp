<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			<div align="center">
				<h2> 스크립트 테스트1: 1-10까지 출력</h2>
				<hr>
				<%
				for(int i=1;i<=10;i++){
					out.println(i+"<BR>");
				}
				%>
			</div>
		</body>
	</html>