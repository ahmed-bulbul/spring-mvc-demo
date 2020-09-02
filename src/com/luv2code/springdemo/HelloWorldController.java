package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//method
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//method for action process
	@RequestMapping("/pocessForm")
	public String pocessForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsSHoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter form the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the all data in CAPS
		theName = theName.toUpperCase();
		
		//create the message 
		String result = "Yo! "+theName;
		
		//add the message to the model 
		model.addAttribute("message",result);
		
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName")String theName,Model model) {
		
	
		
		//convert the all data in CAPS
		theName = theName.toUpperCase();
		
		//create the message 
		String result = "Hey My Friend v3! "+theName;
		
		//add the message to the model 
		model.addAttribute("message",result);
		
		
		return "helloworld";
		
	}

}
