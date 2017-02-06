package com.jmp.dcm.exception;

import com.jmp.dcm.common.dto.ErrorCode;

public class ObjectReferenceException extends ApplicationException {

	private static final long serialVersionUID = -2673067482315836823L;

	public ObjectReferenceException() {
		super();
	}

	public ObjectReferenceException(String message, Throwable cause, boolean enableSuppression) {
		super(ErrorCode.OBJECT_REFERENCE_ERROR, message, cause, enableSuppression);
	}

	public ObjectReferenceException(Integer errorCode, String message, Throwable cause, boolean enableSuppression) {
		super(errorCode, message, cause, enableSuppression);
	}

	public ObjectReferenceException(String message, Throwable cause) {
		super(ErrorCode.OBJECT_REFERENCE_ERROR, message, cause);
	}

	public ObjectReferenceException(Integer errorCode, String message) {
		super(errorCode, message);

	}

	public ObjectReferenceException(String message) {
		super(ErrorCode.OBJECT_REFERENCE_ERROR, message);
	}

	public ObjectReferenceException(Throwable cause) {
		super(ErrorCode.OBJECT_REFERENCE_ERROR, cause);
	}

}
