<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			body {
				font-size: small;
				color:white;
			}
		</style>		
	</head>
	
	<body>
		<h4>예외 처리</h4>
		<hr/>
		<p>작업 처리 도중 문제가 발생했습니다.</p>
		<p>내용: <%=exception.getMessage()%> </p>
	</body>
</html>