package com.common.dto;

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
public class LabDto {
	
	private Integer labId;
	private String labName;
    private String location;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    private String registrationNumber; // optional govt registration ID


}
