package com.cg.springassignment1.usingjavaconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.springassignment1")
public class AppConfig {
	 @Bean(name="empList")
	   public ArrayList<Employee> getEmpList(){
	      Employee e1=new Employee(12345,"Harry",30000.0, 30);
	      Employee e2=new Employee(123456,"Harriet",40000.0, 28);
	      ArrayList<Employee> empList=new ArrayList<>();
	      empList.add(e1);
	      empList.add(e2);
	      return empList;
	   }
	  
	
	}



