package com.example.db.learn_jpa_hibernate.projects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Minijobportal {
	@Id
	private int id;
	@Column
	private String company;
	private String location;
	private double salary;
	
	public Minijobportal(){
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Minijobportal [id=" + id + ", company=" + company + ", location=" + location + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
