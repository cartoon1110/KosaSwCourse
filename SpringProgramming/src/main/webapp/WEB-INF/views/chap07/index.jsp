<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			body {
				font-size: small;
				color: white;
			}
			a {
				color: white;
			}
			a:hover {
				color: orange;
			}
		</style>
	</head>
	<body>
		<h3>Chap07. 스프링 MVC</h3>
		<hr/>
		
		<div>
			<h4>Common Object</h4>
			<ul>
				<li><a href="commandObject">/commandObject</a></li>
			</ul>
		</div>
		
		<div>
			<h4>@ModelAttribute</h4>
			<ul>
				<li><a href="modelAttribute1">/modelAttribute1</a></li>
				<li><a href="modelAttribute2">/modelAttribute2</a></li>
			</ul>
		</div>
		
		<div>
			<h4>@CookieValue, @RequestHeader</h4>
			<ul>
				<li>
					<a href="cookieValueSet">/cookieValueSet</a>
					<a href="cookieValueGet">/cookieValueGet</a>
				</li>
				<li><a href="requestHeader">/requestHeader</a></li>
			</ul>
		</div>
		
		<div>
			<h4>커맨드 객체 값 검증과 에러 메시지</h4>
			<ul>
				<li><a href="login">Login 커맨드 값 검증</a></li>
				<li><a href="join">Member 커맨드 값 검증</a></li>
			</ul>
		</div>
	</body>
</html>