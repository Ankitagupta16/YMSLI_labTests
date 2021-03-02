package com.customerapp.model.entity;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private Date dob;
	
	public Customer() {
		super();
	}

	public Customer(String name, String address, String phoneNumber, Date dob) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}

	public Customer(int id, String name, String address, String phoneNumber, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}
	
	

}
