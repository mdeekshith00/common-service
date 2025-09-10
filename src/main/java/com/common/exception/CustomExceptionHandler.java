package com.common.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.common.constants.ErrorConstants;
import com.common.vo.BaseVO;
import com.common.vo.ErrorResponse;


@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	private ErrorResponse buildErrorDetails(String errorCode, String errorMessage, String category, String severity, List<?> errors) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(errorMessage);
		errorResponse.setCode(errorCode);
		errorResponse.setCategory(category);
		errorResponse.setSeverity(severity);
		if(errors != null && !errors.isEmpty()) {
			errorResponse.setErrors(errors);
		}
		return errorResponse;
	}


	@ExceptionHandler(BloodBankRuntimeException.class)
	public ResponseEntity<BaseVO> handleZmaterRuntimeException(BloodBankRuntimeException ex, WebRequest request) {
		ErrorResponse errorDetails = buildErrorDetails(ex.getErrorCode(), ex.getErrorMessage(), ex.getCategory(), ex.getSeverity(), ex.getErrors());
		return ResponseEntity.status(ex.getHttpStatus()).body(errorDetails);
	}

	@ExceptionHandler(BloodBankBusinessException.class)
	public ResponseEntity<BaseVO> handleZmaterBusinessException(BloodBankBusinessException ex, WebRequest request) {
		ErrorResponse errorDetails = buildErrorDetails(ex.getErrorCode(), ex.getErrorMessage(), ex.getCategory(), ex.getSeverity(), ex.getErrors());
		return ResponseEntity.status(ex.getHttpStatus()).body(errorDetails);
	}

	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<String> handleMaxSizeException(MaxUploadSizeExceededException exc) {
		return ResponseEntity.status(HttpStatus.PAYLOAD_TOO_LARGE)
				.body("File size exceeds the maximum allowed limit of 5 MB.");
	}

	  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
	    public ResponseEntity<String> handleEnumConversionError(MethodArgumentTypeMismatchException ex) {
	        if (ex.getRequiredType().isEnum()) {
	            String error = "Invalid value " + ex.getValue();
	            return ResponseEntity.badRequest().body(error);
	        }
	        return ResponseEntity.badRequest().body("Invalid parameter value");
	    }
}
