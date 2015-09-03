<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<title>Home</title>
		<style type="text/css">
			/*------------------------------------*/
			* {
				margin: 0px;
				padding: 0px;
			}
			/*------------------------------------*/
			body {
				width: 960px;
				margin: 0px auto;
				background-color: #292929;
				color: #FFFFFF;				
				background-image: url(resources/image/img4.jpg);
				background-size: auto 100%;
				background-repeat: no-repeat;
			}	
			/*------------------------------------*/				
			#page {
				height: 100vh;
				display: flex;
				flex-direction: column;

			}
			/*------------------------------------*/			
			#header {
				margin: 20px 0px;
				font-style: italic;
			}
			#content1 {
				height: 200px;
				display: flex;
			}
			#content2 {
				flex: 1;
				margin-top: 10px;
				min-height: 300px;
				display: flex;
			}
			#footer {
				margin: 20px 0px;
			}			
			/*------------------------------------*/	
			#content1 #login {
				width: 250px;
				border: 3px solid #464646;	
				border-radius: 10px;			
			}
			
			#content1 #frontImage {
				flex: 1;
				border: 3px solid #464646;
				border-radius: 10px;
				margin-left: 10px;
				padding: 10px;

			}
			
			/*------------------------------------*/
			#content2 #menu {
				width: 250px;
				border: 3px solid #464646;	
				border-radius: 10px;
				padding: 10px;
				overflow-y: hidden;
			}
			
			#content2 #menu ul {
				margin-top: 10px;
			}
			
			#content2 #menu ul h4 {
				margin-top: 10px;
			}
			
			#content2 #menu a {
				display:block;
				margin: 1px 10px 1px 20px;
				text-decoration: none;
				font-size: small;
				color: white;
			}
			
			#content2 #menu a:hover {
				color: orange;
			}
			
			#content2 #content {
				flex: 1;	
				margin-left: 10px;		
				position: relative;		
			}
			
			#content2 #content iframe {
				width: 100%;
				height: 100%;
				position: absolute;
				border: none;
			}
		</style>
	</head>
	
	<body>
		<div id="page">
			<div id="header">
				<h1>SpringProgramming</h1>
			</div>
			
			<div id="content1">
				<div id="login"></div>
				<div id="frontImage" >
				</div>
			</div>
			
			<div id="content2">
				<div id="menu">
					
					<ul>
						<h4>스프링 게시판</h4>
						<li><a href="product/list" target="iframe">상품 게시판</a></li>
						<li><a href="board/list" target="iframe">일반 게시판</a></li>
						<li><a href="phote/list" target="iframe">사진 게시판</a></li>
						<li><a href="file/list" target="iframe">자료 게시판</a></li>
					</ul>
				</div>
			<div id="content">
				<iframe name="iframe" height="100%" width="100%"></iframe>
			</div>
		</div>
			
		<div id="footer">
			<h5>덕이의 홈페이지</h5>
		</div>
	</div>
	</body>
</html>
