package com.cg.taineemanagement.exception;

public class TraineeIdExceptionResponse {

	private String projectIdentifier;

	public TraineeIdExceptionResponse(String projectIdentifier) {
		super();
		this.projectIdentifier = projectIdentifier;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}


}