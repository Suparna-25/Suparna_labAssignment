/*
 * This class hold all the details of an Employee
 * @author:Suparna Arya
 */
package com.cg.eis.bean;

public class Employee {
	private String id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;

	public Employee(String id, String name, int salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
			}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

}
