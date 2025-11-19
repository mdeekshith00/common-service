package com.common.vo;

import lombok.Data;

@Data
public class UserEvent {

	    private String message;
	    private String eventType;
	    private String userId;
	    private String email;
	    private String timestamp;
	    private String payload;


}
