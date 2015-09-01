<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- 타입에 따라 게시글과 댓글을 구분함 -->
<%@ attribute name="type" %>

<c:if test="${uid != null}">
<c:choose> 
	<c:when test="${type == 'msg'}"><input  type="text" name="msg" maxlength="100"></c:when>
	<c:when test="${type == 'rmsg'}">댓글달기 <input  type="text" name="rmsg" maxlength="50" size="60"></c:when>
</c:choose>
</c:if>

<c:if test="${uid == null}">
<c:choose> 
	<c:when test="${type == 'msg'}"><input type="text" name="msg" maxlength="100" disabled="disabled"  value="작성하려면 로그인 하세요!!"></c:when>
	<c:when test="${type == 'rmsg'}">댓글달기 <input type="text" name="rmsg" maxlength="50" size="60" disabled="disabled" value="작성하려면 로그인 하세요!!"></c:when>
</c:choose>
</c:if>