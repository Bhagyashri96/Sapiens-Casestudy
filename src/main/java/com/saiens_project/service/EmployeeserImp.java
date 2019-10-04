package com.saiens_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saiens_project.dao.EmployeeInt;
import com.saiens_project.model.Employee;

@Repository
public class EmployeeserImp implements EmployeeServInt {
    
	@Autowired
	EmployeeInt  emp;
	
	public void addser(Employee employee) {
		System.out.println("Im Here1");
       		emp.add(employee);
	}

}
