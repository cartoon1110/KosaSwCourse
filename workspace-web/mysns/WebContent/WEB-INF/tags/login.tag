<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form name="loginform" method="post" action="user_control.jsp">

	<c:choose>
		<c:when test="${uid != null}">
			<li id="check"><a href="sns_control.jsp?action=getall&suid=${uid}">${uid}'s Board</a></li>
			<input type="hidden" name="action" value="logout">
			<br>
			<input type="submit" value="Logout">
		</c:when>
	
		<c:otherwise>
			<input type="hidden" name="action" value="login">
			<h2 class="user_id">ID:</h2>
				<input type="text" name="uid" size="15" ><br><br>
			<h2 class="user_pw">Password:</h2>
				<input type="password" name="passwd" size="15" ><br><br>
			<input type="submit" value="Login">
		</c:otherwise>
	</c:choose>
</form>