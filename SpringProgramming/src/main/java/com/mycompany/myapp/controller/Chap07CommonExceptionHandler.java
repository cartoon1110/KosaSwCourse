package com.mycompany.myapp.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//Spring�� �����ϴ� ��ü, �̰��� ���� ������ ������ ������ �� �� ����.
@Component
@ControllerAdvice("com.mycompany.myapp.controller")
public class Chap07CommonExceptionHandler {
	
	//���ܰ� �߻��ϰ� �Ǹ� �޼ҵ尡 �ڵ����� ����ȴ�.
	@ExceptionHandler(Exception.class)
	public String handleException(){
		//�����ڿ��� ����/SMS�� ����.
		//����ڿ��� ������ JSP �̵�.
		return "chap07/exception";
	}
}
