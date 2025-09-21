package com.common.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import com.common.vo.AddressVo;
import com.common.vo.RoleVo;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto extends BaseDTO {
	
	private Integer userId;
	
    private String fullname;
	
	private String username;
		
	private String phoneNumber;
	
    private Boolean isPhoneNumberVerified;
    
	private String gender;

	private String eMail;

	private AddressVo address ;

//	private Boolean isAvailableToDonate;

	private String addressType;
	
	private LocalDate dateOfBirth;
	
	private Boolean isActive;
	
	private LocalDateTime updatedAt;
	
//	private LocalDateTime lastDonationDate;
		
	private String bio;
	
	private Boolean wantToDonate; 
	
	private Set<RoleVo> roles;


}
