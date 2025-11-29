package com.common.dto;

import java.time.Instant;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SearchBloodInventoryDTO {
	
	   private Integer inventoryId;

	    private String bloodGroup;
	    private String rhFactor;
	    private Double volumeML;

	    private String sourceType;
	    private Integer sourceId;

	    private LocalDateTime collectionDate;
	    private Instant expiryDate;

	    private String status;
	    private boolean verified;

	    private String componentType;
	    private String priorityLevel;
	    private String quarantineStatus;

	    private String bloodFrom;
	    private LocalDateTime createdAt;
	    private LocalDateTime updatedAt;

	    private String accessLevel;

	    private String storageUnitName;  // From StorageUnit
	    private Integer storageUnitId;

	    private Integer bankId;          // From BloodBank → StorageUnit → BloodInventory
	    private String bankName;

}
