package com.cg.taineemanagement.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TraineeIDException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TraineeIDException() {
		super();
	}

	public TraineeIDException(String errMsg) {
		super(errMsg);
	}
}