package com.common.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.common.vo.ErrorDetails;

public class BloodBankRuntimeException extends BloodBankCustomException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1199208520486900970L;

	@Deprecated
	public BloodBankRuntimeException(String errorMessage, HttpStatus httpStatus, String errorCode) {
		super(errorMessage);
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
		this.errorCode = errorCode;
	}

	@Deprecated
	public BloodBankRuntimeException(String errorMessage, HttpStatus httpStatus, String errorCode,
								  List<ErrorDetails> list) {
		super(errorMessage);
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
		this.errorCode = errorCode;
		if(this.errors == null) {
			this.errors = new ArrayList<>();
		}
		this.errors.addAll(list);
	}

	public BloodBankRuntimeException(ExceptionKeys exceptionKey) {
		super(exceptionKey);
	}

	public BloodBankRuntimeException(ExceptionKeys exceptionKey, List<ErrorDetails> errorDetails, String customMessage) {
		super(exceptionKey, errorDetails);
		this.errorMessage = customMessage != null ? customMessage : exceptionKey.getDescription();
		if (this.errors == null) {
			this.errors = new ArrayList<>();
		}
	}




}
