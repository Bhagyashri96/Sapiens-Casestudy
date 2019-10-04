package com.saiens_project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String fname;
	private String lname;
	private Integer dept;
	
	@OneToOne(mappedBy = "emp")
    private Address ad;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval= true)
	private Set<Project> projrctref;
    
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Integer getDept() {
		return dept;
	}
	public void setDept(Integer dept) {
		this.dept = dept;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Employee(Integer id, String fname, String lname, Integer dept) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dept=" + dept + "]";
	}
 
	

}
