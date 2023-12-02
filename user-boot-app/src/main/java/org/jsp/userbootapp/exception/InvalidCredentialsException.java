package org.jsp.userbootapp.exception;

public class InvalidCredentialsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Invalid Phone Number or Email or Password";
	}
}
