package com.services;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("tom") && password.equals("pass")) {
			return true;
		}
		return false;
	}
}
