package com.common.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import com.common.vo.AddressVo;
import com.common.vo.RoleVo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DonorResponseDto  extends BaseDTO{

	
	private Integer userId;
	
    private String fullname;
	
	private String username;
		
	private String phoneNumber;
    
	private String gender;

	private String eMail;

	private String address ;

	private String addressType;
	
	private LocalDate dateOfBirth;
	
	private String bio;
	
	private Boolean wantToDonate; 
	
	private String role;
}
