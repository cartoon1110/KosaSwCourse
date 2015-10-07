<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
			a {
				text-decoration: none;
				color: white;
			}
			
			a:hover {
				color: orange;
			}
			
			li {
				float: left;
				margin: 10px;
				padding: 10px;
				list-style: none;
				background-color: gray;
			}
		</style>
	</head>
	
	<body>
		<h4>웹 브라우저의 종류</h4>
		
		<%
		String userAgent = (String)request.getAttribute("userAgent");
		%>
		
		<%if(userAgent.indexOf("Chrome") !=-1 && userAgent.indexOf("Edge") == -1) {%>
				크롬
		<%} else if(userAgent.indexOf("Edge") != -1) {%>
				엣지
		<%} else { %>
				IE 혹은 사파리
		<%}%>
	</body>
</html>