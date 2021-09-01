package com.hallowworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HalloController {
	
	@GetMapping
	public String hello() 
	{
		return "Hello Generation !!!";
	}
}
