package com.simplilearn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/view")
	public String display(HttpServletRequest req, Model m) {
		System.out.println("inside view controller ...");
		// read the information given by the user
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(name.equals("admin") && pass.equals("admin"))
		{
			String msg = "Hello " + name + ".";
			m.addAttribute("message", msg);
			return "viewadmin";
 		}
		else if(!name.equals("admin") && pass.equals("admin1")) {
			String msg = "Hello " + name + ".";
			m.addAttribute("message", msg);
			return "viewuser";
		}
		else {
			String msg = "Sorry " + name + ". You entered an incorrect password!!!";
			m.addAttribute("message", msg);
			return "error";
		}
		
	}
}
