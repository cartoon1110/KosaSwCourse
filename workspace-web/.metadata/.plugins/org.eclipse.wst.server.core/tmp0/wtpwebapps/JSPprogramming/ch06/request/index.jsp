<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			<h4>요청 마라메타값 받기</h4>
			<a href="request_form.jsp">request_form.jsp</a>
			<h4>[요청방식]</h4>
			<p>1. GET 방식</p>
			<ul>
				<li>URL로 직접 입력</li>
				<li>
					&lt;a&gt; 방식 :
					<a href="getMethod.jsp?id=white&name=hongkildong">getMethod.jsp</a>
				</li>
				<li>
					&lt;form method="GET"&gt;
					<form method="GET" action="getMethod.jsp">
						아이디: <input type="text" name="id"/><br/>
						이름: <input type="text" name="name"/><br/>
						<input type="submit" value="getMethod.jsp"/>
					</form>
					
				</li>
			</ul>
			<p>2. POST 방식 </p>
			<ul>
			
				<li>&lt;form method="POST"&gt;
				<form method="POST" action="getMethod.jsp">
						아이디: <input type="text" name="id"/><br/>
						이름: <input type="text" name="name"/><br/>
						<input type="submit" value="getMethod.jsp"/>
					</form>
				
				</li>
			</ul>
			
			<h4>[클라이언트 IP]</h4>
			<%=request.getRemoteAddr() %>
			
			<h4>[클라이언트 OS 및 브라우저 정보]</h4>
			<%String browser=request.getHeader("User-Agent"); %>
			<%  if(browser.indexOf("MSIE 8.0")!=-1){ %>
					Internet Explorer8 이군요.
			<%} else if(browser.indexOf("MSIE 9.0")!=-1){ %>
					Internet Explorer9 이군요.
			<%}	else if(browser.indexOf("MSIE 10.0")!=-1){ %>
					Internet Explorer10 이군요.
			<%}	else if(browser.indexOf("MSIE 11.0")!=-1){ %>
					Internet Explorer11 이군요.
			<%}	else if(browser.indexOf("Chrome")!=-1){ %>
					Chrome 이군요.
			<%} %>
		</body>
		
	</html>