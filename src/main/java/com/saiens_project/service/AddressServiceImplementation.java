package com.saiens_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saiens_project.dao.AddressInterface;
import com.saiens_project.model.Address;


@Repository
public class AddressServiceImplementation implements AddressServiceInterface{

	@Autowired
	AddressInterface addressInterface;
     
	public void addser(Address address) {
		addressInterface.addaddress(address);
	}
	

}
