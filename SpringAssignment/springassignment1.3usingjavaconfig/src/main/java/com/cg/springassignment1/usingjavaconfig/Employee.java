package com.cg.springassignment1.usingjavaconfig;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;
	
	
	public Employee() {
		super();
	}
	
   	

	public Employee(int employeeId, String employeeName, double salary, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
	}



	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "[Employee [empAge="+ age +",empId=" + employeeId + ", empName=" + employeeName + ", empSalary=" + salary +"]";
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}




}
