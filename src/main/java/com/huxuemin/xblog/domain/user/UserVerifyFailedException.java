package com.huxuemin.xblog.domain.user;

public class UserVerifyFailedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8921418915486461985L;

	@Override
	public String toString() {
		return "User Verify failed!";
	}
}
