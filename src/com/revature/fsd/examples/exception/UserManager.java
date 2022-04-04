package com.revature.fsd.examples.exception;

public class UserManager {
	
	public static void signup(String email, String password) throws EmailAlreadyExistsException {
		boolean emailAlreadyExists = true;
		if (emailAlreadyExists) {
			throw new EmailAlreadyExistsException("Email: " + email + " already exits.");
		}
	}

	public static void main(String[] args) {
		//UserManager.signup("john@gmail.com", "password123");
	}

}
