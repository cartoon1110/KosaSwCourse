package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.BoardController;
import controller.MemberController;

public class DispatcherServlet extends HttpServlet {
	private MemberController memberController;
	private BoardController boardController;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		memberController=new MemberController();
		boardController=new BoardController();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// URL 매핑
		
		String requestURI=request.getRequestURI();
		
		/* /jspProgramming/mvc/member */
		if(requestURI.indexOf("/mvc/member")!=-1){
			memberController.handle(request, response);
		
		}
		
		/*/JspProgramming/mvc/board */
		else if(requestURI.indexOf("mvc/board")!=-1){
			boardController.handle(request, response);
		}
		
	}

}
