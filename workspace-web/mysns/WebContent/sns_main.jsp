<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="sns"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Swim!</title>
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		
		<!-- 스타일 시트 관련 링크  -->
		<link rel="stylesheet" href="css/styles.css" type="text/css"
			media="screen" />
		<!-- 본문의 메인 디자인을 위한 스타일시트 링크 -->
		<link rel="stylesheet"
			href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
		<!-- jQuery-UI를 사용하기 위한 스타일시트 링크 -->
		
		<!-- jquery와 jquery-ui 사용을 위한 자바스크립트파일 링크 -->
		<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
		<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
		
		<!-- accordion 컴포넌트의 이벤트 동작을 위한 jquery구문 -->
		<!-- 게시글의 제목을 클릭했을 때 본문이 보였다 숨겨졌다 함 -->
		<script>
			function newuser() {
				window.open(
					"new_user.jsp",
					"newuser",
					"titlebar=no, location=no, scrollbars=no, resizeable=no, menubar=no, toolbar=no, width=500, height=300");
			}
		
			$(document).ready(function() {
				var timer = setInterval(function() {
					var now = new Date();
					var hr = now.getHours();
					var min = now.getMinutes();
					var sec = now.getSeconds();
		
					if (hr >= 10) {
						hNum = hr;
					} else {
						hNum = "0" + hr;
					};
		
					if (min >= 10) {
						mNum = min;
					} else {
						mNum = "0" + min;
					};
		
					if (sec >= 10) {
						sNum = sec;
					} else {
						sNum = "0" + sec;
					};
		
					$("p span").eq(0).text(hNum);
					$("p span").eq(1).text(mNum);
					$("p span").eq(2).text(sNum);
				}, 1000)
		
				$("section").on("mousemove", function(e) {
					var posX = e.pageX;
					var posY = e.pageY;
		
					$(".p21").css({
						"right" : -180 - (posX / 30),
						"bottom" : -480 - (posY / 30)
					});
					$(".p22").css({
						"right" : 130 + (posX / 50),
						"bottom" : -40 + (posY / 50)
					});
				});
		
			});
		</script>

	</head>

	<body>
		<div id="wrap">
			<section>
				<img class="p21" src="img/obj21.png">
				<img class="p22" src="img/obj22.png">
			</section>
				
			<!-- sns -->
			<ul id="sns">
				<li><a href="#"><img src="img/facebook_32.png"></a></li>
				<li><a href="#"><img src="img/twitter_32.png"></a></li>
				<li><a href="#"><img src="img/youtube_32.png"></a></li>
			</ul>
				
			<!-- 텍스트박스 -->
			<h1>Let's Swimming!</h1>
		
			<!-- 시계 -->
			<p id="side">
				<span>00</span> : <span>00</span> : <span>00</span>
			</p>
		

					<!-- 주 메뉴 -->
					<div class="menu">
						<a href="#"><i class="fa fa-home fa-1g"></i>&nbsp; Home</a>
						<a href="sns_login.jsp" target="iframe"><i class="fa fa-user fa-1g"></i>&nbsp; Login</a>
						<a href="javascript:newuser()"><i class="fa fa-user-plus fa-1g"></i>&nbsp; Sign Up</a>
						<a href="sns_control.jsp?action=getall" target="iframe"><i class="fa fa-table fa-1g"></i>&nbsp; Board</a>
					</div>

			</div>
	</body>
</html>