package com.ease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/show")
	public ModelAndView getWelcomeMsg() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Welcome To Spring MVC".toUpperCase());
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
