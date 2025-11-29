package com.common.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchHospitalInventoryDTO {
	
	private Integer hospitalInventoryId;

    private Integer componentId;
    private String bloodGroup;
    private String componentType;

    private String volumeMl;
    private LocalDate expiryDate;

    private String status;
    private String source;
    private String storageLocation;

    // Minimal Hospital Info
    private Long hospitalId;
    private String hospitalName;
    private String city;
    private String state;


}
