package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//method
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
//	//method 
//	
//	public String processForm() {
//		
//	}

}
