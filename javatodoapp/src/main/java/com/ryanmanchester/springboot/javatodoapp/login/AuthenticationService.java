package com.ryanmanchester.springboot.javatodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		if(username.equalsIgnoreCase("Ryan") && password.equals("PW01")) return true;
		return false;
	}

}
