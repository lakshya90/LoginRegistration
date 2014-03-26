package com.lakshya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

	@RequestMapping("/login")
	public ModelAndView login() {
		String message = "Hi User! Please enter your login details";
		return new ModelAndView("login", "message", message);
	}

}
