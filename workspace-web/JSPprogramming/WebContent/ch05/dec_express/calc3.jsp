<%@ page contentType="text/html; charset=UTF-8"%>


<!--선언문(JSP가 클래스로 변화될 때 필드와 메소드가 될 부분)-->
<%!
	//필드 선언
	int num1, num2=0;
	int result=0;
	String op="";
	
	//연산자별 처리를 위한 메서드 선언
	public int calculator(){
		if(op.equals("+")){
			result=num1+num2;
		}else if(op.equals("-")){
			result=num1-num2;
		}else if(op.equals("*")){
			result=num1*num2;
		}else if(op.equals("/")){
			result=num1/num2;
		}
		return result;
	}
%>

<!--스크립트릿(요청시 마다 실행되는 코드)-->
<%
	//웹 페이지 요청이 POST인 경우에만 수행, 즉 폼을 통해 전달된 것만 수행
	//초기 로딩 시 오류 방지
	System.out.println("스크립트릿");
	if(request.getMethod().equals("POST")){
		
		//문자열 형태로 전달된 인자들을 int로 변환함
		num1=Integer.parseInt(request.getParameter("num1"));
		num2=Integer.parseInt(request.getParameter("num2"));
		op=request.getParameter("operator");
		
	}
%>


<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>계산기</title>
		</head>
		<body>
			<CENTER>
				<h3>계산기</h3>
				<hr>
				<!--action의 서블릿 요청 경로에 주의해야함. 서블릿 클래스에 선언된 요청과 같음-->				
				<form name=form1 method=post>
					<INPUT type ="text" NAME="num1" width=200 size="5">
					<select NAME="operator">
						<option selected>+</option>
						<option>-</option>
						<option>*</option>
						<option>/</option>
					</select>
					<INPUT Type="text" Name="num2" width=200 size="5">
					<INPUT Type="submit" value="계산" Name="B1" >
					<INPUT Type="reset" value="다시 입력" Name="B2" >
				</form>
				<!--표현식: 하나의 값을 출력하는 코드-->
			<HR>계산 결괴:<%=calculator() %>
			</CENTER>
		</body>
	</html>