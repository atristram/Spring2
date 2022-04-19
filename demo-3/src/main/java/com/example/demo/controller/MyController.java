package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/greet")
		public String welcome() {
		return "abc.html";	
		}
	
	@RequestMapping("/welcome")
	public String welcome2() {
	return "xyz.html";	
	}
	@RequestMapping("/")
	public String welcome3() {
	return "homepage.html";	
	}
	@RequestMapping("/message")
	@ResponseBody
	public String welcome4() {
	return "<h2>This is some message from the controller</h2>";	
	}
}
