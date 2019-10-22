package com.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEndpoint {

	@RequestMapping("/")
	public String hello() {
		return "Hello.";
	}
	
}
