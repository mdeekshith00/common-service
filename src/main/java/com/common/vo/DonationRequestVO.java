package com.common.vo;

import com.common.enums.DonationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonationRequestVO {
    private Integer eventId;
    private String bloodGroup;
    private Double volume;
	private DonationType donationType;
    private Boolean alcoholLast24h;   
	private Boolean tattooLast6Months;   // Tattoo in last 6 months
	private Boolean drugUse;             // Drug use history
	private int pulse;                   // Pulse rate
    private double temperature; 

}
