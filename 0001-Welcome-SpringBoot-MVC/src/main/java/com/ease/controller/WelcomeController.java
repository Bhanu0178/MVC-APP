package com.ease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/show")
	public ModelAndView getWelcomeMsg() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Welcome To Spring MVC".toUpperCase());
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
