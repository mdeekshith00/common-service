package com.common.exception;

import org.springframework.http.HttpStatus;

public class BloodBankBusinessException extends BloodBankCustomException{
/**
	 * 
	 */
	private static final long serialVersionUID = 5115988062462604998L;

	//	@Deprecated
	public BloodBankBusinessException(String errorMessage, HttpStatus status, String errorCode) {
		super(errorMessage);
		this.errorMessage = errorMessage;
		this.httpStatus = status;
		this.errorCode = errorCode;
	}

	public BloodBankBusinessException(ExceptionKeys exceptionKey) {
		super(exceptionKey);
	}

	public BloodBankBusinessException(ExceptionKeys exceptionKey, String errorMessage) {
		super(exceptionKey);
		this.errorMessage = errorMessage;
	}

}
