package com.saiens_project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {


	@Id
	@GeneratedValue
	private Integer add_id;
	private Integer  id;
	private String Present_add;
	private Integer contact_no;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="f_id")
	private Employee emp;
	
	public Integer getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
	
	
	
	public String getPresent_add() {
		return Present_add;
	}
	public void setPresent_add(String present_add) {
		Present_add = present_add;
	}
	public Integer getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Address(Integer add_id, Integer id, String present_add, Integer contact_no) {
		super();
		this.add_id = add_id;
		this.id = id;
		this.Present_add = present_add;
		this.contact_no = contact_no;
	}
	public Address() {
		super();
	}
	
	
}
