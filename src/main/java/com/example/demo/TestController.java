package com.example.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/admin")
	public String test() {

		return "Hello Admin!";
	}

	@GetMapping("/special")
	public String profile() {

		return "Hello Special User!";
	}
	
	@GetMapping("/user")
	public String publicapi() {

		return "Hello User!";
	}
}
