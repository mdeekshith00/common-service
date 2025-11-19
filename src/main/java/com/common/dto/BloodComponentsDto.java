package com.common.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.common.enums.BloodGroupType;
import com.common.enums.ComponentStatus;
import com.common.enums.ComponentType;

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
public class BloodComponentsDto {
	
	private Integer componentId;
    private Double volumeMl; 
    private BloodGroupType bloodGroup;        // e.g., "A+", "B-", etc.
    private LocalDate collectionDate;
    private LocalDate expiryDate;
    private UUID processingBatchId;
    private UUID storageLocationId;
    private ComponentType componentType; // RBC, PLASMA, PLATELETS, CRYO
    private ComponentStatus status; // QUARANTINED, AVAILABLE, EXPIRED, SHIPPED
    private UUID parentSampleId;

}
