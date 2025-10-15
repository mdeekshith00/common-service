package com.common.enums;

import lombok.Getter;

@Getter
public enum CERTIFICATETYPE {
    POINTS  ,       // 1st time
    COUPON,        // after 3 donations
    VOUCHER,       // after 5 donations
    BADGE,         // after 10 donations
    CERTIFICATE;    // beyond 10 donations
	
	private  String type;
	public boolean checkType(String typeId) {
		for(CERTIFICATETYPE certi :values()) {
			if(certi.getType().equalsIgnoreCase(typeId)) {
				return true;
			}
		}
		return false;
	}
	

}
