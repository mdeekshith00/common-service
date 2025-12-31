package com.common.util;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import com.common.enums.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ExpiryGeneratorPerType {
	@Setter
	@Getter
	@AllArgsConstructor
	public static class ExpiryPerType {
//		private ComponentType componentType;
		private Instant expiryDate;
		private String temperature;
		
	}
	
	public static ExpiryPerType getExpiryDatePerComponentType(ComponentType componentType) {
		Instant now = Instant.now();
		
		if(ComponentType.RBC.name().equalsIgnoreCase(componentType.name())) {
			return new ExpiryPerType(now.plus(35,ChronoUnit.DAYS) , "1-6°C");
		}
		else if(ComponentType.WASHED_RBC.name().equalsIgnoreCase(componentType.name())) {
			return new ExpiryPerType(now.plus(1,ChronoUnit.DAYS) , "1-6°C");
		}
		else if(ComponentType.PLASMA.name().equalsIgnoreCase(componentType.name())) {
			return new ExpiryPerType(now.plus(365,ChronoUnit.DAYS) , "≤-18°C");
		}
		else if(ComponentType.CRYO.name().equalsIgnoreCase(componentType.name())) {
			return new ExpiryPerType(now.plus(365,ChronoUnit.DAYS) , "≤-18°C");
		} 
		else if(ComponentType.PLATELETS.name().equalsIgnoreCase(componentType.name())) {
			return new ExpiryPerType(now.plus(5,ChronoUnit.DAYS) , "20-24°C");
		} 
		else if(ComponentType.WBC.name().equalsIgnoreCase(componentType.name())) {
			return new ExpiryPerType(now.plus(1,ChronoUnit.DAYS) , "20-24°C");
		} 
		else {
			return new ExpiryPerType(now.plus(21,ChronoUnit.DAYS) , "1-6°C");
		}
		
	}

//	Whole Blood -- 21-35 days -- 1-6°C	
//	RBC -- 35-42 days -- 1-6°C
//	Washed RBC -- 24 hours -- 1-6°C
//	Plasma (FFP) -- 365 days -- ≤-18°C
//	Cryoprecipitate (CRYO) -- 365 days -- ≤-18°C
//	Platelets -- 5-7 days -- 20-24°C (with agitation)
//	Granulocytes (WBC) -- 24 hours -- 20-24°C (with agitation)
}
