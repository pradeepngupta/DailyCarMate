package com.dailycarmate.basecomponent.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dailycarmate.basecomponent.codes.ErrorCode;
import com.dailycarmate.basecomponent.codes.ResponseCode;
import com.dailycarmate.basecomponent.codes.ResponseData;
import com.dailycarmate.basecomponent.exception.AccountLockedException;
import com.dailycarmate.basecomponent.exception.ApplicationException;
import com.dailycarmate.basecomponent.exception.DuplicateObjectException;
import com.dailycarmate.basecomponent.exception.InvalidCredentialsException;
import com.dailycarmate.basecomponent.exception.ObjectNotFoundException;
import com.dailycarmate.basecomponent.exception.ObjectReferenceException;

public abstract class BaseController {

	private static final Logger log = LoggerFactory.getLogger(BaseController.class);

	protected ResponseData wrapResponse(Object payload, String message, boolean success) {
		ResponseData responseData = new ResponseData();
		responseData.setData(payload);
		responseData.setMessage(message);
		responseData.setStatus(success ? ResponseCode.SUCCESS : ResponseCode.ERROR);
		return responseData;
	}

	protected ResponseData wrapResponse(Object payload, boolean success) {
		return wrapResponse(payload, null, success);
	}

	protected ResponseData wrapResponse(Object payload) {
		return wrapResponse(payload, true);
	}

	protected ResponseData wrapResponse(Object payload, String message) {
		return wrapResponse(payload, message, true);
	}

	protected ResponseData wrapResponse(String message) {
		return wrapResponse(null, message, true);
	}

	protected ResponseData wrapResponse() {
		return wrapResponse(null, true);
	}

	protected ResponseData wrapException(Integer errorCode, String message) {
		log.error(message);
		ResponseData responseData = new ResponseData();
		responseData.setStatus(ResponseCode.FAILURE);
		responseData.setErrorCode(errorCode);
		responseData.setMessage(message);
		return responseData;
	}

	protected ResponseData wrapException(String message) {
		return wrapException(null, message);
	}

	@ExceptionHandler(ObjectReferenceException.class)
	@ResponseStatus(HttpStatus.ACCEPTED)
	protected @ResponseBody ResponseData handleObjectReferenceException(ObjectReferenceException e) {
		return wrapException(e.getErrorCode(), e.getMessage());
	}

	@ExceptionHandler(ObjectNotFoundException.class)
	@ResponseStatus(HttpStatus.ACCEPTED)
	protected @ResponseBody ResponseData handleObjectNotException(ObjectNotFoundException e) {
		return wrapException(e.getErrorCode(), e.getMessage());
	}

	@ExceptionHandler(ApplicationException.class)
	@ResponseStatus(HttpStatus.ACCEPTED)
	protected @ResponseBody ResponseData handleApplicationException(ApplicationException e) {
		return wrapException(e.getErrorCode(), e.getMessage());
	}

	@ExceptionHandler(value = NullPointerException.class)
	@ResponseStatus(HttpStatus.ACCEPTED)
	protected @ResponseBody ResponseData handleNullPointerException(NullPointerException e) {
		log.error("NullPointerException", e);
		return wrapException("NullPointerException has occured");

	}

	@ExceptionHandler(value = RuntimeException.class)
	@ResponseStatus(HttpStatus.ACCEPTED)
	protected @ResponseBody ResponseData handleException(RuntimeException e) {
		log.error(e.getMessage(), e);
		return wrapException(e.getMessage());

	}

	@ExceptionHandler(value = DuplicateObjectException.class)
	@ResponseStatus(HttpStatus.ACCEPTED)
	protected @ResponseBody ResponseData handleDuplicateKeyException(DuplicateObjectException e) {
		return wrapException(ErrorCode.DUPLICATE_KEY_FOUND, e.getMessage());
	}

	@ExceptionHandler(value = AccountLockedException.class)
	@ResponseStatus(HttpStatus.LOCKED)
	protected @ResponseBody ResponseData handleException(AccountLockedException e) {
		return wrapException(e.getErrorCode(), e.getMessage());
	}

	@ExceptionHandler(value = InvalidCredentialsException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	protected @ResponseBody ResponseData handleException(InvalidCredentialsException e) {
		return wrapException(e.getMessage());

	}
}
