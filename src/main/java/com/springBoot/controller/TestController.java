package com.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
 
	@GetMapping("/hi")
	public String hi() {
		return "hello word!";
	}
	@GetMapping("/test")
	public String test() {
		return "我的第一个spring boot!";
	}
}
