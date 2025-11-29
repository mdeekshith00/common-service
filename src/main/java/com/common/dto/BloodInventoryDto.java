package com.common.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.common.enums.BloodGroupType;
import com.fasterxml.jackson.annotation.JsonInclude;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BloodInventoryDto {
	
	private Integer bankId;
	private Integer donationId;
	private Integer donorId;
	private Integer sampleId;
	private String bloodGroup;
	private LocalDateTime collectedAt;
	private LocalDateTime testedDate;
	private String testStatus;
	private String targetBloodBank;
	private LabDto lab;
	private List<BloodComponentsDto> bloodComponets;
	
//	public void setBloodGroup(Object bloodGroup2) {
//		// TODO Auto-generated method stub
//		
//	}

}
