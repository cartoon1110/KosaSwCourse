<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New User</title>
		<link rel="stylesheet" href="css/styles1.css" type="text/css" media="screen" />
		<style type="text/css">
			body{
				background: url(img/newuser1.png);
				background-repeat: no-repeat;
			}
			h2{
				margin-left:90px;
			}
			
			hr{
				color: black;
			}
			td{
				text-align:center;
			}
			
		</style>
	</head>

	<body>
		<div>
			<H2>Sign Up</H2>
			<img class="n1" src="img/visual01_02 (1).png">
			<img class="n2" src="img/visual01_02 (2).png">
			<form method="post" action="user_control.jsp?action=new">
				<table border="1" cellspacing="1" cellpadding="5">
					<tr>
						<td>Name</td>
						<td><input type="text" name="name" size="20" required></td>
					</tr>
					<tr>
						<td>ID</td>
						<td><input type="text" name="uid" size="20" required></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email" size="20"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="passwd" size="20" required>
					</tr>
					<tr>
					<td colspan=2 align=center><input type=submit value="sign up"></td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
