package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "hello world!";
	}

	@GetMapping("/test2")
	public String test2() {
		return "hello world!";
	}
}
