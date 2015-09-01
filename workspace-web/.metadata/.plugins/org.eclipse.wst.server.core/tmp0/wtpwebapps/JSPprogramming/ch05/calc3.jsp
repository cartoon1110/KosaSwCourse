<%@ page contentType="text/html; charset=UTF-8"%>

<%-- 선언문(JSP가 클래스로 변화될 때 필드와 메소드가 될 부분) --%>
<%! 
	//필드
	int num1;
	int num2;
	int result;
	String op = "";
	
	//메소드
	public int calculator() {
		if(op.equals("+")) {
			result = num1 + num2;
		} else if(op.equals("-")) {
			result = num1 - num2;
		} else if(op.equals("*")) {
			result = num1 * num2;
		} else if(op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
%>

<!-- 스크립트릿(요청시 마다 실행되는 코드) -->
<%
System.out.println("스크립트릿1");
if(request.getMethod().equals("POST")) {
	//문자열 형태로 전달된 인자들을 int로 변환함
	num1 = Integer.parseInt(request.getParameter("num1"));
	num2 = Integer.parseInt(request.getParameter("num2"));
	op = request.getParameter("operator");
}
%>

<%
System.out.println("스크립트릿2");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<%
		String title = "계산기";
		%>
		<title><%=title%></title>
	</head>
	
	<body>
		<CENTER>
			<H3>계산기</H3>
			<HR>
			<!-- action 의 서블릿 요청 경로에 주의 해야함. 서블릿 클래스에 선언된 요청과 같아야 함 -->
			<form name=form1 method=post>
				<INPUT TYPE="text" NAME="num1" width=200 size="5">
				<SELECT NAME="operator"> 
					<option selected>+</option>
					<option>-</option>
					<option>*</option>
					<option>/</option>
				</SELECT>
				<INPUT TYPE="text" NAME="num2" width=200 size="5"> 
				<input type="submit" value="계산" name="B1"> <input type="reset" value="다시입력" name="B2">
			</form>
			<hr/>
			<%
			int result = calculator();
			%>
			
			계산 결과: <%=result%>
		</CENTER>
	</body>
</html>