package com.jmp.dcm.common.dto;

public interface ErrorCode {

	// 10 - 99 series -> Common errors
	// 100  series -> related to user creation
	public static final Integer UNKNOWN = -1;
	public static final Integer NO_ERROR = 0;
	public static final Integer TOO_MANY_RECORDS = 11;
	public static final Integer OBJECT_NOT_FOUND = 12;
	public static final Integer OBJECT_REFERENCE_ERROR = 13;
	
	
	public static final Integer VALIDATION_FAILED = 21;
	public static final Integer PASSWORD_CHANGE_REQUIRED = 22;
	public static final Integer UNIQUE_CONSTRAINT_VIOLATION = 23;
	public static final Integer ID_NOT_PROVIDED = 24;
	public static final Integer CURRENT_PASSWORD_MISMATCHED = 25;
	public static final Integer DUPLICATE_KEY_FOUND = 26;
	public static final Integer ACCOUNT_LOCKED = 27;
	public static final Integer INVALID_DATA_ERROR = 28;
	
	public static final Integer USERID_EXISTS = 100;
	public static final Integer ROLE_EXISTS=101;
    public static final Integer NOT_SUPPORTED=102;
    
}
