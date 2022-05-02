package com.microservice.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsg {
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Welcome To Eureka Client Ret API-02";
	}
	
	@GetMapping("/greet2")
	public String greetMsg2() {
		return "Welcome To Eureka Client Ret API-02-Greet-02";
	}

}
