package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Employee;

@Controller
public class CustomController {

	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.html";
	}
	
	@RequestMapping("/verify")
	public String registerPage() {
		return "registration.html";
	}
	
	@RequestMapping("/registerEmp")
	public ModelAndView registerEmployee(Employee emp) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("e",emp);
		mv.setViewName("welcome.jsp");
		
		return mv;
	}
}
