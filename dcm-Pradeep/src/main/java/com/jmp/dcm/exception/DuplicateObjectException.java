package com.jmp.dcm.exception;

import com.jmp.dcm.common.dto.ErrorCode;

public class DuplicateObjectException extends ApplicationException {

	private static final long serialVersionUID = -2673067482315836823L;
	
	public DuplicateObjectException() {
		super();
	}

	public DuplicateObjectException(String message, Throwable cause, boolean enableSuppression) {
		super(ErrorCode.DUPLICATE_KEY_FOUND, message, cause, enableSuppression);
	}

	public DuplicateObjectException(Integer errorCode, String message, Throwable cause, boolean enableSuppression) {
		super(errorCode, message, cause, enableSuppression);
	}
	
	public DuplicateObjectException(String message, Throwable cause) {
		super(ErrorCode.DUPLICATE_KEY_FOUND , message, cause);
	}

	public DuplicateObjectException(Integer errorCode, String message) {
		super(errorCode, message);
		
	}
	
	public DuplicateObjectException(String message) {
		super(ErrorCode.DUPLICATE_KEY_FOUND ,message);
	}

	public DuplicateObjectException(Throwable cause) {
		super(ErrorCode.DUPLICATE_KEY_FOUND, cause);
	}

	
	
}
