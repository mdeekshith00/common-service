package com.common.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DonorCreateRequestDto {
    private Integer userId;
    private String email;
    private String fullName;
    private String phoneNumber;
    private String gender;
    private LocalDate dateOfBirth;

}
