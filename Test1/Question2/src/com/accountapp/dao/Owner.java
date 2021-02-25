package com.accountapp.dao;

public class Owner {

	private String name;
	private Date dateOfBirth;
	private String nic;

	//constructors
	public Owner() {
	}

	public Owner(String name, Date dateOfBirth, String nic) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nic = nic;
	}

	public Owner(Owner owner) {
		this.name = owner.name;
		this.dateOfBirth = owner.dateOfBirth;
		this.nic = owner.nic;
	}

	//methods
	public void input(Owner owner) {
		this.name = owner.name;
		this.dateOfBirth = owner.dateOfBirth;
		this.nic = owner.nic;
	}

	public void print() {

		System.out.println("Name : " + name);
		System.out.println("Birthdate:");
		this.dateOfBirth.print();
		System.out.println();
		System.out.println("NIC: " + nic);
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nic=" + nic + "]";
	}

	
}
