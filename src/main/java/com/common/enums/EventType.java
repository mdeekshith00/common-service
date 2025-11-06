package com.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventType {
	
	   USER_CREATED("User created"),
	    USER_UPDATED("User updated"),
	    USER_DELETED("User deleted"),
	    
	    BLOOD_REQUEST_CREATED("Blood request created"),
	    BLOOD_REQUEST_APPROVED("Blood request approved"),
	    BLOOD_REQUEST_REJECTED("Blood request rejected"),

	    DONATION_SCHEDULED("Donation scheduled"),
	    DONATION_COMPLETED("Donation completed"),

	    STOCK_UPDATED("Stock updated");

	    private final String description;

}
