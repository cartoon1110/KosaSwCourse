<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>트위터 로그인</title>
			<style type="text/css">
				*{
					text-align: center;
				}
			</style>
		</head>
		<body>
			<h2>트위터 로그인</h2>
			<form name="form1" method="post" action="twitter_list.jsp">
				<input type="text" name="username"/>
				<input type="submit" value="로그인"/>
			</form>
		</body>
	</html>