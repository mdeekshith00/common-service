package com.common.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SessionResponseVo {
	
	private String JWt_UserId;
	private String username;
	private String phone;
	private List<String> role;
	

}
