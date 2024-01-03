package com.ryanmanchester.springboot.javatodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping(path="/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}
	
	@RequestMapping(path="/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
