package com.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BloodGroupType {
	 A_POSITIVE("A+"),
	    A_NEGATIVE("A-"),
	    B_POSITIVE("B+"),
	    B_NEGATIVE("B-"),
	    AB_POSITIVE("AB+"),
	    AB_NEGATIVE("AB-"),
	    O_POSITIVE("O+"),
	    O_NEGATIVE("O-");

    private final String value;

    BloodGroupType(String value) {
        this.value = value;
    }

    @JsonValue // tells Jackson how to serialize
    public String getValue() {
        return value;
    }

	public static boolean isValid(String input) {
		for(BloodGroupType type : BloodGroupType.values()) {
			if(type.getDeclaringClass().equals(input))
				return true;
		}
		return false;
	}

}
