package com.common.enums;

import lombok.Getter;

@Getter
public enum RoleType {
	    USER,
	    ADMIN,                  // User-Service, Blood-Service, Camp-Service
	    HOSPITAL_ADMIN,         // Hospital-Service, Camp-Service, Blood-Service
	    HOSPITAL_STAFF,         // Hospital-Service
	    HOSPITAL_BLOOD_MANAGER, // Hospital-Service
	    CAMP_COORDINATOR,       // Camp-Service
	    VOLUNTEER,              // Camp-Service
	    DONOR,                  // User-Service, Camp-Service, Blood-Service
	    AUDITOR,                // Blood-Service
	    SYSTEM ;           // System/Service role across all microservices

	    private  String roleName;
	    private  String responsibilities;
	    private  String permissions;

	    public boolean checkRole(String checkType) {
	    	for(RoleType role1 : values()) {
	    		if(role1.getRoleName().equalsIgnoreCase(checkType))
	    			return true;
	    	}
	    	return false;
	    }

}
