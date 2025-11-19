package com.common.dto;

import com.common.enums.BloodGroupType;
import com.common.enums.DonationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DonationResponseDto {
	
	private Integer donorId;
	private Integer eventId;
	private BloodGroupType bloodGroup;
	private Double volume;
	private DonationType donationType;
    private Boolean alcoholLast24h;   
	private Boolean tattooLast6Months;   // Tattoo in last 6 months
	private Boolean drugUse;             // Drug use history
	private int pulse;                   // Pulse rate
    private double temperature; 
	

}
