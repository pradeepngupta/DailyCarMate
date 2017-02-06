package com.jmp.dcm.common.dto;

import java.io.Serializable;

public class ResponseData implements Serializable{

	private static final long serialVersionUID = -8206900663750768655L;
	private String status;
	private Integer errorCode;
	private Object data;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
