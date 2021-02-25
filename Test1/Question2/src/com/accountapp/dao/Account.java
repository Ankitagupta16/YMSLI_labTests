package com.accountapp.dao;

public abstract class Account {
	
	private Owner owner;
	private float balance;
	private String number;
	
	//constructors
	public Account() {
	}
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}
	
	public void input (Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}
	
	
	//getters
	protected Owner getOwner() {
		return owner;
	}
	public float getBalance() {
		return balance;
	}
	protected String getNumber() {
		return number;
	}
	
	//setter
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}
	
	//abstract methods
	abstract public void deposit(float amount);
	abstract public void print();
	abstract public void withdraw(float amount);
}
