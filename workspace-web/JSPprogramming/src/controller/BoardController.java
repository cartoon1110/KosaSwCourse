package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;
import service.BoardService;

public class BoardController {
	private ServletContext application;
	private BoardService boardService;
	
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*useBean사용한 코드와 동일한의미 , JSP에선 application 변수를 바로 사용 가능*/
		/* 서블릿과 컨트롤러에서는 application 변수를 선언하지 않으면 사용 불가능*/
		if(boardService==null){
			application=request.getServletContext();
			boardService=(BoardService)application.getAttribute("boardService");
			if(boardService==null){
				boardService=new BoardService();
				application.setAttribute("boardService", boardService);
			}
		}
		
		
		String action=request.getParameter("action");
		switch(action){
			case "list": list(request,response);break;
			case "writeForm":writeForm(request, response); break;
			case "write": write(request, response); break;
		}
	}

	private void write(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

	private void writeForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=request.getRequestDispatcher("/exam_mvc/write_form.jsp");
		rd.forward(request, response);
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Board> list=boardService.getPage(1, 10);
		request.setAttribute("list", list);
		
		Board board=list.get(0);
		request.setAttribute("board", board);
		
		RequestDispatcher rd=request.getRequestDispatcher("/exam_mvc/list.jsp");
		rd.forward(request, response);
		
	}

}
