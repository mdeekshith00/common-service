package com.common.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class ErrorResponse extends BaseVO {
	private String code;
	private String message;
	private String category;
	private String severity;
	private List<?> errors;

}
