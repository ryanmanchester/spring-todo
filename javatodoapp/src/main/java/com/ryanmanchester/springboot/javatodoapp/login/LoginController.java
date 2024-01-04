package com.ryanmanchester.springboot.javatodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping(path="/login")
	public String login() {
		return "login";
	}

}
