/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2015-08-18 02:23:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class sns_005fmain_005fui_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/tags/login.tag", Long.valueOf(1439530933477L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1439529924450L));
    _jspx_dependants.put("jar:file:/C:/kosaswcourse/workspace-jspex/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mysns/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/tags/write.tag", Long.valueOf(1439530933483L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>My SNS</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles3.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" />\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.js\" ></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.10.3/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#accordion\").accordion({\r\n");
      out.write("\t\t\theightStyle : \"content\",\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction newuser() {\r\n");
      out.write("\t\twindow\r\n");
      out.write("\t\t\t\t.open(\r\n");
      out.write("\t\t\t\t\t\t\"new_user.jsp\",\r\n");
      out.write("\t\t\t\t\t\t\"newuser\",\r\n");
      out.write("\t\t\t\t\t\t\"titlebar=no,location=no,scrollbars=no,resizeable=no,menubar=no,toolbar=no,width=300,height=240\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--[if IE]><script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"container1\">\r\n");
      out.write("\t\t\t<h1 class=\"fontface\" id=\"title\">My Simple SNS</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:newuser()\">New User</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sns_control.jsp?action=getall\">전체글보기</a>\r\n");
      out.write("\t\t\t\t<li>");
      if (_jspx_meth_sns_005flogin_005f0(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<section id=\"main\">\r\n");
      out.write("\t\t\t<section id=\"content\">\r\n");
      out.write("\t\t\t\t<b>내소식 업데이트</b>\r\n");
      out.write("\t\t\t\t<form class=\"m_form\" method=\"post\" action=\"sns_control.jsp?action=newmsg\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"uid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_sns_005fwrite_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"submit\" type=\"submit\">등록</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<h3>친구들의 최신 소식</h3>\r\n");
      out.write("<div id=\"accordion\">\r\n");
      out.write("  <h3>김프리 :: 2013.7.8:14:00 작성 [좋아요 6 | 댓글 4]</h3>\r\n");
      out.write("  <div>\r\n");
      out.write("    <p>어제는 나홀로 영화를 보았습니다. ^^ 사람들이 이상하다고 해도 나는 즐거워요..</p>\r\n");
      out.write("    <p>[삭제] 좋아요 / 2013.7.8:14:00 </p>\r\n");
      out.write("    <ul class=\"reply\">\r\n");
      out.write("    \t<li>홍길동 :: 저랑 똑 같네요....  - 2013.7.8:14:00 <a href=\"\">삭제</a></li>\r\n");
      out.write("    \t<li>아무개 :: 이런일은 있어서는 안되지요.. 파이팅~~~ - 2013.7.8:14:00</li>\r\n");
      out.write("    \t<li>김사랑 :: 전화 하지 그랬니.... 친구 좋다는 것이 ㅋㅋㅋ - 2013.7.8:14:00</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    \t<form action=\"\" class=\"\">\r\n");
      out.write("    \t\t댓글달기 <input type=\"text\" name=\"\" size=\"60\">\t\r\n");
      out.write("    \t</form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<aside id=\"sidebar2\">\r\n");
      out.write("\t\t\t\t<!-- sidebar2 -->\r\n");
      out.write("\t\t\t\t<h2>새로운 친구들.!!</h2>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">user1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">user2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">user3</a></li>\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t<h3>We're Social Too!!</h3>\r\n");
      out.write("\t\t\t\t<img src=\"img/facebook_32.png\"> <img src=\"img/twitter_32.png\">\r\n");
      out.write("\t\t\t\t<img src=\"img/youtube_32.png\"> <br> <br>\r\n");
      out.write("\t\t\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>Links</h3>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">한빛미디어</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">가천대학교</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">가천대학교 길병원</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</aside>\r\n");
      out.write("\t\t\t<!-- end of sidebar -->\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"container1\">\r\n");
      out.write("\t\t\t<section id=\"footer-area\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section id=\"footer-outer-block\">\r\n");
      out.write("\t\t\t\t\t<aside class=\"footer-segment\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>About</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">About My Simple SNS</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Copyright</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Author</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</aside><!-- end of #first footer segment -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<aside class=\"footer-segment\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Java Web Programming</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Book Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Table of contents</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Book History</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</aside><!-- end of #second footer segment -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<aside class=\"footer-segment\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Contact Us</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Book Support</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Publication</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Investor Relations</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</aside><!-- end of #third footer segment -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<aside class=\"footer-segment\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Hee Joung Hwang</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>&copy; 2014 <a href=\"#\">dinfree.com</a> </p>\r\n");
      out.write("\t\t\t\t\t</aside><!-- end of #fourth footer segment -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t<!-- end of footer-outer-block -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<!-- end of footer-area -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_sns_005flogin_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sns:login
    org.apache.jsp.tag.weblogin_tag _jspx_th_sns_005flogin_005f0 = (new org.apache.jsp.tag.weblogin_tag());
    _jsp_instancemanager.newInstance(_jspx_th_sns_005flogin_005f0);
    _jspx_th_sns_005flogin_005f0.setJspContext(_jspx_page_context);
    _jspx_th_sns_005flogin_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_sns_005flogin_005f0);
    return false;
  }

  private boolean _jspx_meth_sns_005fwrite_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sns:write
    org.apache.jsp.tag.webwrite_tag _jspx_th_sns_005fwrite_005f0 = (new org.apache.jsp.tag.webwrite_tag());
    _jsp_instancemanager.newInstance(_jspx_th_sns_005fwrite_005f0);
    _jspx_th_sns_005fwrite_005f0.setJspContext(_jspx_page_context);
    // /sns_main_ui_test.jsp(57,5) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_sns_005fwrite_005f0.setType("msg");
    _jspx_th_sns_005fwrite_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_sns_005fwrite_005f0);
    return false;
  }
}
