package com.cg.eis.service;
import com.cg.eis.bean.*;

public interface EmployeeService {
	Employee getEmployeeDetails();

	void findInsuranceScheme(Employee emp);

	void display(Employee emp);

}