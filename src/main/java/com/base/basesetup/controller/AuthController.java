package com.base.basesetup.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("api/auth")
public class AuthController {

	@GetMapping("/test")
	public String test() {
		return "Hello";
	}
	
	
}
