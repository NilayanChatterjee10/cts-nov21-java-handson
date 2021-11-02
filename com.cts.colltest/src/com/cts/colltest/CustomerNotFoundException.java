package com.cts.colltest;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
