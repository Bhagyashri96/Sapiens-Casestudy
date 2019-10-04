package com.saiens_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saiens_project.dao.ProjectDaoInterface;
import com.saiens_project.model.Project;

@Repository
public class ProjectServiceImplementation implements ProjectServiceInterface{

	@Autowired
	ProjectDaoInterface projectDaoInterface;

	public void addProject(Project project) {
		// TODO Auto-generated method stub
		projectDaoInterface.add(project);
	}

}
