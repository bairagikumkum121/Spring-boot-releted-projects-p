package com.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
public String test() {
		int a=10;
		int b=20;
	return "this result /t a and b is: "+(a+b);
}
	
}
