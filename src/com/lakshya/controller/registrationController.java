package com.lakshya.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lakshya.model.*;
import com.lakshya.service.RegisterService;;


@Controller
@RequestMapping(value={""})
public class registrationController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value={"","/"})
	public ModelAndView home() throws Exception{
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		List<Register> registration = registerService.getAll();
		
		params.put("registration", registration);
		
		params.put("register", new Register());
		
		return new ModelAndView("home", params);
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("registration") Register registration) throws Exception{
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		if(!StringUtils.hasText(registration.getFirstname())){
			
			params.put("usernameMessage", "Input required");
			
			return new ModelAndView("home", params);
			
		}
		
		registerService.create(registration);
		
		return new ModelAndView("redirect:/");
	}
}
