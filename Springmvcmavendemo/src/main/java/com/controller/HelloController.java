package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController
{
	@RequestMapping(value = "/home")
	public String hello()
	{
		System.out.println("controller class method");
		
		return "Welcome";
	}
	
	@RequestMapping(value = "/about")
	public String about()
	{
		return "about";
	}

}
