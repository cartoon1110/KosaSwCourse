<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
		<h4>회원가입</h4>
		<hr/>
		<form:form commandName="member">
			memberId:
			<form:input path="memberId" size="20"/>
			<!-- 22라인의 코드와 같다. <input type="text" id="memberId" name="memberId" value="${member.memberId} size="20" /> -->
			<form:errors path="memberId"/> <br/><!-- 에러가 발생하면  -->
			memberName:
			<form:input path="memberName" size="20"/>
			<form:errors path="memberName"/> <br/>
			memberPassword:
			<form:password path="memberPassword" size="20"/>
			<form:errors path="memberPassword"/> <br/>
			memberBirthday:
			<!-- <input type="date" name="memberBirthday"/> -->
			<input type="text" name="memberBirthday"/>
			<form:errors path="memberBirthday"/> <br/>
			<input type="submit" value="회원가입"/>
		</form:form>
	</body>
</html>