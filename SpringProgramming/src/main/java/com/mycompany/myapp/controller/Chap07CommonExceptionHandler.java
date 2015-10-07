package com.mycompany.myapp.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//Spring이 관리하는 객체, 이것을 하지 않으면 의존성 주입을 할 수 없다.
@Component
@ControllerAdvice("com.mycompany.myapp.controller")
public class Chap07CommonExceptionHandler {
	
	//예외가 발생하게 되면 메소드가 자동으로 실행된다.
	@ExceptionHandler(Exception.class)
	public String handleException(){
		//관리자에게 메일/SMS를 보냄.
		//사용자에게 보여줄 JSP 이동.
		return "chap07/exception";
	}
}
