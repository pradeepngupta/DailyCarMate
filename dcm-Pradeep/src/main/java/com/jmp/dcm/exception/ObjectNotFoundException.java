package com.jmp.dcm.exception;

import com.jmp.dcm.common.dto.ErrorCode;

public class ObjectNotFoundException extends ApplicationException{

private static final long serialVersionUID = -2673067482315836823L;
	
	public ObjectNotFoundException() {
		super();
	}

	public ObjectNotFoundException(String message, Throwable cause, boolean enableSuppression) {
		super(ErrorCode.OBJECT_NOT_FOUND, message, cause, enableSuppression);
	}

	public ObjectNotFoundException(Integer errorCode, String message, Throwable cause, boolean enableSuppression) {
		super(errorCode, message, cause, enableSuppression);
	}
	
	public ObjectNotFoundException(String message, Throwable cause) {
		super(ErrorCode.OBJECT_NOT_FOUND , message, cause);
	}

	public ObjectNotFoundException(Integer errorCode, String message) {
		super(errorCode, message);
		
	}
	
	public ObjectNotFoundException(String message) {
		super(ErrorCode.OBJECT_NOT_FOUND ,message);
	}

	public ObjectNotFoundException(Throwable cause) {
		super(ErrorCode.OBJECT_NOT_FOUND, cause);
	}

	
	
}
