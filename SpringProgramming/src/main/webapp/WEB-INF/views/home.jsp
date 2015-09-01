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
			
			#content1 #frontImage img {
				width: 665px;
				height: 175px;
			}

			/*------------------------------------*/
			#content2 #menu {
				width: 250px;
				border: 3px solid #464646;	
				border-radius: 10px;
				padding: 10px;
				overflow-y: scroll;
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
				<div id="frontImage">
					<img src="resources/image/frontImage.jpg"/>
				</div>
			</div>
			
			<div id="content2">
				<div id="menu">
					<ul>
						<h4>Chap01</h4>
						<li><a href="#">1절. XXXXXX</a></li>
						<li><a href="#">2절. XXXXXX</a></li>
						<li><a href="#">3절. XXXXXX</a></li>
					</ul>
					
					<ul>
						<h4>Chap02</h4>
						<li><a href="#">1절. XXXXXX</a></li>
						<li><a href="#">2절. XXXXXX</a></li>
						<li><a href="#">3절. XXXXXX</a></li>
					</ul>
					
					<ul>
						<h4>Chap03</h4>
						<li><a href="#">1절. XXXXXX</a></li>
						<li><a href="#">2절. XXXXXX</a></li>
						<li><a href="#">3절. XXXXXX</a></li>
					</ul>
					
					<ul>
						<h4>Chap04</h4>
						<li><a href="#">1절. XXXXXX</a></li>
						<li><a href="#">2절. XXXXXX</a></li>
						<li><a href="#">3절. XXXXXX</a></li>
					</ul>
					
					<ul>
						<h4>Chap05</h4>
						<li><a href="#">1절. XXXXXX</a></li>
						<li><a href="#">2절. XXXXXX</a></li>
						<li><a href="#">3절. XXXXXX</a></li>
					</ul>
					
					<ul>
						<h4>Chap06</h4>
						<li><a href="#">1절. XXXXXX</a></li>
						<li><a href="#">2절. XXXXXX</a></li>
						<li><a href="#">3절. XXXXXX</a></li>
					</ul>
				</div>
				<div id="content">
					<iframe name="iframe" height="100%" width="100%"></iframe>
				</div>
			</div>
			
			<div id="footer">
				<h5>Your Name</h5>
			</div>
		</div>
	</body>
</html>
