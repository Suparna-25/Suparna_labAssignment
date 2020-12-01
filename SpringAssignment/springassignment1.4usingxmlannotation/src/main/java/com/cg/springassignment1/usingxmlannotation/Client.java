package com.cg.springassignment1.usingxmlannotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	
  
  @Autowired
  private  List<Employee> emp;

	    
  
    
	
	public List<Employee> getEmp() {
	return emp;
}





public void setEmp(List<Employee> emp) {
	this.emp = emp;
}





	public  Employee getEmplyeeById(int empId)
	{  
		for (Employee employee : emp) {
		if(employee.getEmpId()==empId)
			{
		    	return employee;
			}
			
		}
		return null;
	} 
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	
	        System.out.print( "EmployeeID			:" );
	        int id=sc.nextInt();
	        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	        Client client=(Client)ctx.getBean("client");
	        Employee emp=client.getEmplyeeById(id);
	        System.out.println(emp);

		}
	
}
