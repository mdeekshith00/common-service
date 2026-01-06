package com.common.enums;

public enum StatusType {
	ACTIVE ,
	IN_ACTIVE ,
	BANNED ,
	PENDING_APPROVAL,
	
	DECEASED,
//	DONOR HEALTH CHECKUP STATUS
	PASSED,
	FAILED,
	RECHECK_REQUIRED,
//	DonorRewards status type
	USED, 
	EXPIRED,
	REVOKED,
	
	// blood sample 
	COLLECTED,
	SENT_TO_LAB, 
    TEST_PASSED,
    TEST_FAILED,
    SHIPPED,
    STORED
	
	

}
