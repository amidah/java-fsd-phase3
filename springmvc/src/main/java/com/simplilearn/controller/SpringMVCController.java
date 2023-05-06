package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCController {

	@RequestMapping("/")
	public String display() {
		return "MVC Controller Called ...";
	}
	
}
