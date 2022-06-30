package com.finalproject.yusuf.bus.payload.request;

import com.finalproject.yusuf.bus.model.User;

import io.swagger.annotations.ApiModelProperty;

public class BusCustomRequest {
	
	@ApiModelProperty(hidden = true)
	private Long id;

	private String code;

	private int capacity;

	private String make;

	@ApiModelProperty(hidden = true)
	private User agencyId;
}