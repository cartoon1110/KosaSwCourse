/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2015-08-29 02:20:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.exam01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.*;
import java.util.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("dto");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

int pageNo = 1;
String strPageNo = request.getParameter("pageNo");
if(strPageNo != null) {
	//pageNo가 전달되었을 경우
	pageNo = Integer.parseInt(strPageNo);
}

      out.write("\r\n");
      out.write("\r\n");
      service.BoardService boardService = null;
      synchronized (application) {
        boardService = (service.BoardService) _jspx_page_context.getAttribute("boardService", javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (boardService == null){
          boardService = new service.BoardService();
          _jspx_page_context.setAttribute("boardService", boardService, javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\r\n");

List<Board> list = boardService.getPage(pageNo, boardService.getRowsPerPage()); 

      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\ttable {\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\t\tfont-size: small;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttable, th, td {\r\n");
      out.write("\t\t\t\tborder: 1px solid black;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tth {\r\n");
      out.write("\t\t\t\tbackground-color: orange;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#buttonGroup {\r\n");
      out.write("\t\t\t\tmargin: 10px;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#pager {\r\n");
      out.write("\t\t\t\tmargin-top: 5px;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tfont-size: small;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#pager a{\r\n");
      out.write("\t\t\t\ttext-decoration:none;\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<h4>게시물 목록</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width:50px\">번호</th>\r\n");
      out.write("\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:60px\">글쓴이</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:80px\">날짜</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:60px\">조회수</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
for(Board board : list) {
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(board.getNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"detail.jsp?board_no=");
      out.print(board.getNo());
      out.write('"');
      out.write('>');
      out.print(board.getTitle());
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print((board.getWriter().length()>3)?board.getWriter().substring(0,3):board.getWriter());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(board.getDate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(board.getHitcount());
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"pager\">\r\n");
      out.write("\t\t\t");

			int groupNo = boardService.getGroupNo(pageNo);
			
      out.write("\r\n");
      out.write("\t\t\t<a href=\"list.jsp?pageNo=1\">[처음]</a>\r\n");
      out.write("\t\t\t");
if(groupNo>1) {
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pageNo=");
      out.print(boardService.getStartPageNo(groupNo-1));
      out.write("\">[이전]</a>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
for(int i=boardService.getStartPageNo(groupNo); 
				  i<=boardService.getEndPageNo(groupNo); 
				  i++) {
      out.write("\r\n");
      out.write("\t\t\t");
      out.print((pageNo==i)?"<b>":"" );
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pageNo=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>\r\n");
      out.write("\t\t\t");
      out.print((pageNo==i)?"</b>":"" );
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
if(groupNo<boardService.getTotalGroupNo()) {
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pageNo=");
      out.print(boardService.getStartPageNo(groupNo+1));
      out.write("\">[다음]</a>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t<a href=\"list.jsp?pageNo=");
      out.print(boardService.getTotalPageNo());
      out.write("\">[맨끝]</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"buttonGroup\">\r\n");
      out.write("\t\t\t<a href=\"write_form.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"../common/images/board/write.gif\"/>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
