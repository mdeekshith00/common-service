package com.common.vo;


import com.common.enums.BloodGroupType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MinDonorVo {

	private Integer userId;
	private String role;
	private String bloodGroup;
}
