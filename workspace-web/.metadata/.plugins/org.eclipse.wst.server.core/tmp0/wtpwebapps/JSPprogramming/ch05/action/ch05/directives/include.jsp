<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			.menu {
				display:flex;
				border-top: 1px solid black;
				border-bottom: 1px solid black;
			}
			.menuitem {
				padding: 5px 10px;
				flex: 1;
			}
			.news, .shopping {
				width: 300px;
				padding: 5px 10px;
				border: 1px solid black;
			}
		</style>
	</head>
	
	<body>
		<%@ include file="menu.jsp" %>
		<table>
			<tr>
				<td class="news"><%@ include file="news.jsp" %></td>
				<td class="shopping"><%@ include file="shopping.jsp" %></td>
			</tr>
		</table>
	</body>
</html>