package com.finalproject.yusuf.bus.payload.request;

import io.swagger.annotations.ApiModelProperty;

public class UserPasswordRequest {
	  @ApiModelProperty(hidden = true)
		private Long id;

	  private String password;
	}
