package com.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalStaffCreateRequestDto {
    private Integer userId;
    private String email;
    private String fullName;
    private String phoneNumber;
    private Integer hospitalId;

}
