package com.dailycarmate.basecomponent.exception;

import org.springframework.security.authentication.LockedException;

public class AccountLockedException extends LockedException {

	private static final long serialVersionUID = 1L;

	private String message;
	private Integer errorCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public AccountLockedException(String msg) {
		super(msg, new ApplicationException());
		this.message = msg;
	}

	public AccountLockedException(Integer errorCode) {
		super("User Account has been locked", new ApplicationException(errorCode));
		this.errorCode = errorCode;
	}

}
