package com.movieapp.services;

import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService {

	String[] usernames = { "sunil", "ravi", "guru", "chandan", "manju", "nitesh", "praveen" };

	// LoginServiceImpl login();
	@Override
	public boolean validUsername(String username, String password) {
		
		

		
		
		  return Stream.of(usernames) .filter(str->str.equals(username) &&
		  password.equals("admin123")) .findAny() .isPresent();
		 


		
	}

}
