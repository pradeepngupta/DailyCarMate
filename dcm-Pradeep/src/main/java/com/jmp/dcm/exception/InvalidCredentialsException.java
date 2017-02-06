package com.jmp.dcm.exception;

import org.springframework.security.authentication.BadCredentialsException;

public class InvalidCredentialsException extends BadCredentialsException {

	private static final long serialVersionUID = 3893114308471551160L;


	public InvalidCredentialsException(String message, Throwable cause) {
		super(message, cause);
	}


	public InvalidCredentialsException(String message) {
		super(message);
	}
}
