package com.common.exception;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.common.vo.ErrorDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BloodBankCustomException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HttpStatus httpStatus;
	protected String errorCode;
	protected String errorMessage;
	protected String severity;
	protected String category;
	protected List<ErrorDetails> errors;

	public BloodBankCustomException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public BloodBankCustomException(ExceptionKeys exceptionKey) {
		this.httpStatus = exceptionKey.getStatus();
		this.errorCode = exceptionKey.getCode();
		this.errorMessage = exceptionKey.getDescription();
		this.category = exceptionKey.getErrorCategory().name();
		this.severity = exceptionKey.getErrorSeverity().name();
	}

	public BloodBankCustomException(ExceptionKeys exceptionKey, List<ErrorDetails> errorDetails) {
		this.httpStatus = exceptionKey.getStatus();
		this.errorCode = exceptionKey.getCode();
		this.errorMessage = exceptionKey.getDescription();
		this.category = exceptionKey.getErrorCategory().name();
		this.severity = exceptionKey.getErrorSeverity().name();
		this.errors = errorDetails;
	}

}
