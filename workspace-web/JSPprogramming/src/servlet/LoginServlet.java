package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.setContentType("text/html; charset=utf-8");
		ServletOutputStream sos=resp.getOutputStream();
/*		String html="";
		html+="<?DOCTYPE html>";
		html+="<html>";
		html+="<head><meta charset='utf-8'></head><body><form method='post' action='LoginServlet'>";
		html+="아이디: <input type='text' name='mid' /><br/>";		
		html+="비번: <input type='password' name='mpass' /><br/>";
		html+="<input type='submit' value='로그인'/><br/>";
		html+="</form>";
		html+="</body>";
		html+="</html>";
		sos.write(html.getBytes("utf-8"));*/
		
		
		/* 서블릿이 html을 만들어내기는 비효율적이라 forward식으로 사용함 주로*/
		RequestDispatcher rd=req.getRequestDispatcher("ch04/login_form.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		req.setCharacterEncoding("utf-8");
		
		String mid=req.getParameter("mid");
		String mpass=req.getParameter("mpass");
		
		resp.setContentType("text/html; charset=utf-8");
		ServletOutputStream sos=resp.getOutputStream();
		String html="";
		html+="<?DOCTYPE html>";
		html+="<html>";
		html+="<head><meta charset='utf-8'></head><body>";
		html+=mid + "님, 로그인 성공";
		html+="</body>";
		html+="</html>";
		sos.write(html.getBytes("utf-8"));
	}
}