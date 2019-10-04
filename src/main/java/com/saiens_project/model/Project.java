package com.saiens_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Integer P_id;
	private Integer id;
	private Integer P_duration;
	private String   P_status;
	
	@ManyToOne
	private Employee efid;
	
	
	public Integer getP_id() {
		return P_id;
	}
	
	public void setP_id(Integer p_id) {
		P_id = p_id;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getP_duration() {
		return P_duration;
	}
	public void setP_duration(Integer p_duration) {
		P_duration = p_duration;
	}
	public String getP_status() {
		return P_status;
	}
	public void setP_status(String p_status) {
		P_status = p_status;
	}
	public Project(Integer p_id, Integer id, Integer p_duration, String p_status) {
		super();
		P_id = p_id;
		this.id = id;
		P_duration = p_duration;
		P_status = p_status;
	}
	public Project() {
		super();
	}
	@Override
	public String toString() {
		return "Project [P_id=" + P_id + ", id=" + id + ", P_duration=" + P_duration + ", P_status=" + P_status + "]";
	}

	
}
