package com.saiens_project.dao;

import javax.transaction.Transactional;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saiens_project.model.Employee;

@Transactional
@Repository
public class EmployeeImp implements EmployeeInt {

	
@Autowired
SessionFactory sessionfactory;
	
	
	public void add(Employee employee) {
		System.out.println("Im Here2");
      sessionfactory.getCurrentSession().save(employee);	
      //sessionfactory.getSessionFactory().openSession().save(employee);
	}


	public Integer delete(Employee id) {
		// TODO Auto-generated method stub
		return null;
	}

}
