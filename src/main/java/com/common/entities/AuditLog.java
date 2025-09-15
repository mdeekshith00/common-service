package com.common.entities;

import java.time.LocalDateTime;


public class AuditLog {

	    private Long id;

	    private String entityType;   // USER, HOSPITAL, DONOR, etc.
	    private Long entityId;

	    private String action;       // CREATE, UPDATE, DELETE, LOGIN
	    private Long performedBy;    // userId who did it

	    private LocalDateTime timestamp;

	
	    private String details;      // JSON old/new state or extra info
	

}
