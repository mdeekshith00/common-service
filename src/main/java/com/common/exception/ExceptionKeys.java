package com.common.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ExceptionKeys {
	
	 API_CALL_FAILURE(HttpStatus.INTERNAL_SERVER_ERROR, "BW_1001", "Internal API call failed", ErrorCategory.SYSTEM, ErrorSeverity.ERROR),
	    PARSING_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "BW_1002", "Error while serialising", ErrorCategory.SYSTEM, ErrorSeverity.ERROR),
	    SERVICE_CENTER_NOT_FOUND(HttpStatus.NOT_FOUND, "BW_1003", "Service center not found", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    DOCUMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "BW_1004", "Document not found", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    DOCUMENT_SIZE_EXCEED(HttpStatus.PAYLOAD_TOO_LARGE, "BW_1005", "Document size exceeds the maximum limit of 5 MB", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    DOCUMENT_UPLOAD_FAILURE(HttpStatus.INTERNAL_SERVER_ERROR, "BW_1006", "Document upload failed", ErrorCategory.APPLICATION, ErrorSeverity.ERROR),
	    SERVICE_CENTER_APPLICATION_NOT_FOUND(HttpStatus.NOT_FOUND, "BW_1007", "Service center application not found", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    VERIFICATION_DOCUMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "BW_1008", "Verification document not found", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    DOCUMENT_TYPE_REQUIRED(HttpStatus.BAD_REQUEST, "BW_1009", "Document type required", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    REFERRAL_PROGRAM_NAME_EXISTS(HttpStatus.BAD_REQUEST, "BW_1010", "Referral program name already exists", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    EMPTY_REQUEST_BODY(HttpStatus.BAD_REQUEST, "BW_1011", "Invalid/empty request body", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    REFERRAL_PROGRAM_DATE_INVALID(HttpStatus.BAD_REQUEST, "BW_1012", "Referral program start/end date is invalid", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    REFERRAL_INCENTIVE_NOT_FOUND(HttpStatus.NOT_FOUND, "BW_1013", "No incentive data found for provided referral", ErrorCategory.REQUEST, ErrorSeverity.ERROR),
	    DOCUMENT_CREATION_FAILURE(HttpStatus.INTERNAL_SERVER_ERROR, "BW_1014", "Document creation failed", ErrorCategory.APPLICATION, ErrorSeverity.ERROR);

	    private final HttpStatus status;
	    private final String code;
	    private final String description;
	    private final ErrorCategory errorCategory;
	    private final ErrorSeverity errorSeverity;

	    ExceptionKeys(HttpStatus status, String code, String description, ErrorCategory errorCategory, ErrorSeverity errorSeverity) {
	        this.status = status;
	        this.code = code;
	        this.description = description;
	        this.errorCategory = errorCategory;
	        this.errorSeverity = errorSeverity;
	    }
}
