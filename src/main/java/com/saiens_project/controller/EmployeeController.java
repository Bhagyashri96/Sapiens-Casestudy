package com.saiens_project.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.saiens_project.dao.EmployeeImp;
//import com.saiens_project.dao.EmployeeInt;
import com.saiens_project.model.Address;
import com.saiens_project.model.Employee;
import com.saiens_project.model.Project;
import com.saiens_project.service.AddressServiceInterface;
import com.saiens_project.service.EmployeeServInt;
import com.saiens_project.service.ProjectServiceInterface;

@Transactional
@Controller
public class EmployeeController {
	
	 
	@Autowired
	private EmployeeServInt employeeServInt;
	
	@Autowired
	private AddressServiceInterface addressServiceInterface;
    
	@Autowired
	private ProjectServiceInterface projectServiceInterface;
	
	
	
	@RequestMapping(value ="/")
	public String display()
	{
		System.out.println("In controller");
	    System.out.println("In controller");
		//Employee emp= new Employee();
		/*//System.out.println("Inside objetc");
		emp.setDept(1);
        emp.setFname("shri");
		emp.setLname("Patil");
		empp.addser(emp);
		
	
		
		Address addd = new Address();
		addd.setId(9);
		addd.setPresent_add("Mumbai");
		addd.setContact_no(123456789);
		addressServiceInterface.addser(addd);
		
		
		
		Project proj = new Project();
		proj.setId(7);	
		proj.setP_duration(6);
		proj.setP_status("current");
		projectServiceInterface.addProject(proj);
		System.out.println("In controller3"); */

 		return "index";
	}
	
	
	
	@RequestMapping(value ="/index")
	public String display2()
	{
		return "index";
	}
	
	
	@RequestMapping(value = "/index1" , method = {  RequestMethod.POST, RequestMethod.GET})
	public String addemployee(Model model, @ModelAttribute("employee") Employee employee)
	{ 
		employeeServInt.addser(employee);
		model.addAttribute("employee", new Employee());
		return "index1";
		
	}
	
	
	
	
	
	
	@RequestMapping(value = "/index2" , method = {  RequestMethod.POST, RequestMethod.GET})
	public String addaddress(Model model, @ModelAttribute("address") Address address)
	{ 
		addressServiceInterface.addser(address);
		model.addAttribute("address", new Address());
		return "index2";
		
	}
	
	
	
	@RequestMapping(value = "/index3" , method = {  RequestMethod.POST, RequestMethod.GET})
	public String addproject(Model model, @ModelAttribute("project") Project project)
	{ 
		
		projectServiceInterface.addProject(project);
		model.addAttribute("project", new Project());
		return "index3";
		
	}
	
}
