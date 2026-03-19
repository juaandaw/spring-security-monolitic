package com.juanmidev.blog.aplication.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanmidev.blog.aplication.user.controller.request.AuthUserRequest;

@RestController
@RequestMapping("auth")
public class UserController {

	@GetMapping("/login")
	public String authenticate(@RequestBody AuthUserRequest request) {
		return "";
	}
}
