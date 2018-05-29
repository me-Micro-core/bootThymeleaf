package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public ModelAndView test(ModelAndView mv) {
	    mv.setViewName("/index");
	    mv.addObject("title","欢迎使用Thymeleaf!");
	    return mv;
	}
}
