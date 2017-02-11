package com.dailycarmate.basecomponent.exception;

import com.dailycarmate.basecomponent.codes.ErrorCode;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 4256330594244616560L;
	protected Integer errorCode = ErrorCode.UNKNOWN;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public ApplicationException() {
	}

	public ApplicationException(Integer errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ApplicationException(Integer errorCode, Throwable exception) {
		super(exception);
		this.errorCode = errorCode;
	}

	public ApplicationException(Integer errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public ApplicationException(String message, Throwable ex, boolean suppress) {
		super(message, ex, suppress, true);
	}

	public ApplicationException(Integer errorCode, String message, Throwable ex, boolean suppress) {
		super(message, ex, suppress, true);
		this.errorCode = errorCode;
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(String message, Throwable exception) {
		super(message, exception);
	}

	public ApplicationException(Integer errorCode, String message, Throwable exception) {
		super(message, exception);
		this.errorCode = errorCode;
	}

	public ApplicationException(Throwable exception) {
		super(exception);
	}

	public static class AppExceptionDto {
		String error;
		Integer code;

		/**
		 * Constructor
		 * 
		 * @param error
		 * @param code
		 */
		public AppExceptionDto(String error, Integer code) {
			super();
			this.error = error;
			this.code = code;
		}

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

	}

}
