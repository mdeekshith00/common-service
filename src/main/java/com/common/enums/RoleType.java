package com.common.enums;

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
	    SYSTEM  ;           // System/Service role across all microservices
	


//	    private final String code;
//	    private final String responsibilities;
//	    private final String permissions;
//
//	    RoleType(String string, String string2, String string3) {
//			// TODO Auto-generated constructor stub
//		}
//
//		void UserRole(String code, String responsibilities, String permissions) {
//	        this.code = code;
//	        this.responsibilities = responsibilities;
//	        this.permissions = permissions;
//	    }
//
//	    public String getCode() {
//	        return code;
//	    }
//
//	    public String getResponsibilities() {
//	        return responsibilities;
//	    }
//
//	    public String getPermissions() {
//	        return permissions;
//	    }
	



}
