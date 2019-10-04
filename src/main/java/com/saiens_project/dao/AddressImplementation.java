package com.saiens_project.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saiens_project.model.Address;


@Transactional
@Repository
public class AddressImplementation implements AddressInterface{

	
	@Autowired
	SessionFactory sessionfactory;
	
	
	public void addaddress(Address address) {
		// TODO Auto-generated method stub
	      sessionfactory.getCurrentSession().save(address);	

		
	}

}
