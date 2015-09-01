<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>JspProgramming</title>
			<style type="text/css">
				*{
					margin:0px;
					padding:0px;
				}
				body{
					width:800px;				
					margin:0 auto;
					background-color:black;
					background-attachment:fixed;
					display:flex;
					flex-direction: column;
				}
				
				#page-wrapper{
					background-color:white;
					margin: 40px 0px;
					padding: 10px 20px;
				}
				 header{
					margin-bottom: 10px;
					text-shadow: 5px 3px 7px rgba(64,64,0,0.5);
				}
				nav{
					background-color:orange;
					border-top:1px solid #c8c8c8;
					border-bottom:1px solid #c8c8c8;
					display: flex;
					flex-direction: row;
				}
				.menu{
								
					margin: 5px;
					width: 70px;
					
				}
				#content{
					display:flex;
					height:400px;
					flex-direction:row;
				}
				#category{
					height: 100%;
					overflow-y: scroll;
					
				}
				.chapter{
					text-align: center;
					margin: 4px;
					font-style: italic;
					font-weight: bold;
				}
				
				#category > a{
					display: block;
					border:0px;
					border-radius: 20px;
					text-align: center;
					line-height: 30px;
					text-decoration: none;
					color: #FFFFFF;
					margin: 2px;
					background-color: orange;
				}
				#category a:nth-child(2n-1){
					background-color: gray;
				}
				#category >a:hover{
					background-color: red;
				}
				
				aside{
					
					height:400px;
					width: 250px;
					border-right:1px solid #c8c8c8;
				}
				section{
					
					height:400px;
					width: 500px;
					flex: 1;
				}
				iframe{
					border : 0px solid black;
					background-color: rgba(160,160,0,0.1);
				}
				footer{
					height: 50px;
					border-top:1px solid #c8c8c8;
				} 
				
			</style>
			
		</head>
		<body>
			<div id= "page-wrapper">
			<header>
				<h1>JspProgramming</h1>
			
			</header>
			<nav>
				<div class="menu">Menu1</div>
				<div class="menu">Menu2</div>
				<div class="menu">Menu3</div>
				<div class="menu">Menu4</div>
				<div class="menu">Menu5</div>
			</nav>
			<div id="content">
				<aside>
					<div id="category">
						<p class="chapter">[Ch05: JSP 기초 문법]</p>
						<a href="ch05/comment.jsp" target="iframe">주석</a>
						<a href="ch05/directives/index.jsp" target="iframe">지시어</a>
						<a href="ch05/action/index.jsp" target="iframe">표준액션</a>
						<a href="ch05/dec_express/scriptlet1.jsp" target="iframe">스크립트릿1</a>
						<a href="ch05/dec_express/scriptlet2.jsp" target="iframe">스크립트릿2</a>
						<a href="ch05/dec_express/calc3.jsp" target="iframe">선언문</a>
						
						<p class="chapter">[Ch06: JSP 내장 객체]</p>
						<a href="ch06/builtin_object.jsp" target="iframe">JSP 내장 객체 개요</a>
						<a href="ch06/request/index.jsp" target="iframe">request</a>
						<a href="ch06/response/index.jsp" target="iframe">response</a>
						<a href="ch06/cookie/index.jsp" target="iframe">cookie</a>
						<a href="ch06/session/index.jsp" target="iframe">session</a>
						<a href="ch06/application/index.jsp" target="iframe">application</a>
						<a href="ch06/bascket/login.jsp" target="iframe">장바구니-세션편</a>
						<a href="ch06/twitter/twitter_login.jsp" target="iframe">트위터</a>
						

						<p class="chapter">[Ch07: JSP 자바 빈즈]</p>
						<a href="ch07/dto.jsp" target="iframe">DTO 이용 방법</a>
						<a href="ch07/dto_auto_setting.jsp" target="iframe">DTO 값 저장</a>
						<a href="ch07/bean_scope.jsp" target="iframe">빈의 사용 범위</a>
						<a href="ch07/database_form.jsp" target="iframe">데이타베이스 연동</a>
						
						<p class="chapter">[ch10: 포현 언어]</p>
						
						<p class="chapter">[ch11: JSTL]</p>
						<a href="ch11/forEach.jsp" target="iframe">&lt;c:forEach&gt;</a>
						
						<p class="chapter">[실습1: 게시판]</p>
						<a href="exam01/list.jsp" target="iframe">게시판 목록</a>
						
						<p class="chapter">[실습2: 게시판]</p>
						<a href="exam/list1.jsp" target="iframe">상품 등록</a>
						
						<p class="chapter">[실습3: MVC 게시판]</p>
						<a href="mvc/board?action=list" target="iframe">게시판 목록</a>
						
						
					</div>
				</aside>
				<section>
					<iframe name="iframe" width="100%" height="100%"></iframe>
				</section>
			</div>
			<footer>
				덕이네
			</footer>
			</div>
		</body>
	</html>