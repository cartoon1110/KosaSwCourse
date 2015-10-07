package com.mycompany.myapp.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {
	private static final Logger logger = LoggerFactory.getLogger(MemberValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Login.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Login login = (Login) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memberId", "required","?•„?ˆ˜ ?•­ëª©ìž…?‹ˆ?‹¤.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memberPassword", "required", "?•„?ˆ˜ ?•­ëª©ìž…?‹ˆ?‹¤.");
	
		int passwordLength = login.getMemberPassword().length();
		if(passwordLength<4) {
			errors.rejectValue("memberPassword", "minlength", new Object[] {4, passwordLength}, "ìµœì†Œ 4?žë¦? ?´?ƒ ?ž…? ¥");
		}
	}

}
