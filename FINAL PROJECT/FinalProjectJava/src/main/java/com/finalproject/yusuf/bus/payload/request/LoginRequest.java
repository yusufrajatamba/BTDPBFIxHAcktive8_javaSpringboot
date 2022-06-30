package com.finalproject.yusuf.bus.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
}