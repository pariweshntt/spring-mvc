package com.hsbc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping
	public String getOrder(){
		return "Hello world";
	}
}
