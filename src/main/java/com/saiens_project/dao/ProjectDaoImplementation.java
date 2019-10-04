package com.saiens_project.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saiens_project.model.Project;


@Transactional
@Repository
public class ProjectDaoImplementation implements ProjectDaoInterface{

	@Autowired
	SessionFactory sessionfactory;
		

	public void add(Project project) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(project);
	}

}
