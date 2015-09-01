<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<%
List<String> titles = new ArrayList<String>();
List<String> images = new ArrayList<String>();
for(int i=1; i<=10; i++) {
	titles.add("제목" + i);
	images.add("miniroombg" + i + ".gif");
}
int adNo = new Random().nextInt(10);
%>
<table style="width:100%; height:100%">
	<tr style="height:30px">
		<td><%=titles.get(adNo)%><td>
	</tr>
	<tr>
		<td>
			<img width="100%" height="110px" 
			   src="../common/images/miniroombg/<%=images.get(adNo)%>"/>
		</td>
	</tr>
</table>

