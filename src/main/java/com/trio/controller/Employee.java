package com.trio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	
	@GetMapping("/sayhi")
	public String getName() {
		return "Hi..Application is running!!!";
	}

	@GetMapping("/")
	public String getEmpDetails() {
		return "running on aws ec2 instance";
	}
}
