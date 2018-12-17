package com.revature.beans;

public class ContactInfo {

	private int id; 
	private String address; 
	private String city; 
	private String email; 
	private int phone; 
	
	public ContactInfo(int id, String address, String city, String email, int phone) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactInfo [id=" + id + ", address=" + address + ", city=" + city + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	
	
}
