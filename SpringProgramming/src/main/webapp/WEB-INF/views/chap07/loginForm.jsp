<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style type="text/css">
			body {
				font-size: small;
				color: white;
			}
		</style>
	</head>
	
	<body>
		<h4>로그인</h4>
		<hr/>
		<form:form commandName="login">
			memberId: 
			<form:input  path="memberId" size="20"/>
			<form:errors path="memberId"/>
			<br/>
			memberPassword:
			<form:password path="memberPassword" size="20"/> 
			<form:errors path="memberPassword"/><br/>
			
			<input type="submit" value="로그인"/>
		</form:form>
	</body>
</html>







