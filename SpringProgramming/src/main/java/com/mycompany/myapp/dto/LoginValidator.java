package com.mycompany.myapp.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {
	private static final Logger logger = LoggerFactory.getLogger(LoginValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Member.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Member member= (Member) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memberId", "required","필수 항목입니다.");
		ValidationUtils.rejectIfEmpty(errors, "memberName", "required", "필수 항목입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memberPassword", "required", "필수 항목입니다.");
		ValidationUtils.rejectIfEmpty(errors, "memberBirthday", "required", "필수 항목입니다.");
	
		int passwordLength = member.getMemberPassword().length();
		if(passwordLength<4) {
			errors.rejectValue("memberPassword", "minlength", new Object[] {4, passwordLength}, "理쒖냼 4�옄由� �씠�긽 �엯�젰");
		}
	}

}
