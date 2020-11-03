package com.cg.eis.exception;

/**
 * This class customized salary exception
 * 
 * @author Suparna Arya
 */
public class EmployeeException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeException() {
		super();
	}

	public EmployeeException(String message) {
		super(message);
	}

}
