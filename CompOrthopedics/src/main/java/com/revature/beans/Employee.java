package com.revature.beans;

public class Employee {
	
	private int id; 
	private int manId; 
	private String firstName;
	private String lastName;
	private String title; 

	public Employee(int id, int manId, String firstName, String lastName, String title) {
		super();
		this.id = id;
		this.manId = manId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManId() {
		return manId;
	}

	public void setManId(int manId) {
		this.manId = manId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", manId=" + manId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", title=" + title + "]";
	}

}
