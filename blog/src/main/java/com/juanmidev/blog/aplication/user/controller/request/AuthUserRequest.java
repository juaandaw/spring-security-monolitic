package com.juanmidev.blog.aplication.user.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthUserRequest {

	private String username;
	private String password;
}
