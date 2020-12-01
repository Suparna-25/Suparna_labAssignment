package com.cg.springassignment1.usingxmlannotation;

public class Employee {
private int empId;
private String empName;
private double salary;

public Employee()
{
	super();
}
@Override
public String toString() {
	return "EmployeeInfo:\n EmployeeID			:" + empId + "\n EmployeeNAME			:" + empName + "\n EmployeeSALARY			:" + salary;
}
public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

}
