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
		<h4>쿠키 얻기</h4>
		<hr/>
		memberId: ${memberId} <br/>
		loginStatus: ${loginStatus}
	</body>
</html>