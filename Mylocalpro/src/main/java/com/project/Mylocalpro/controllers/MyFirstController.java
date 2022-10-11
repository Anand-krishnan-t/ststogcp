package com.project.Mylocalpro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	
	
	@GetMapping(value = "/start")
	public String start() {
		return "Welcome to my project - my first project";
	}
	
	

}
