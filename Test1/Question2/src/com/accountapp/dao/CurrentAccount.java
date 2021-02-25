package com.accountapp.dao;

public class CurrentAccount extends Account {

	private float minimumBalance=500;

	//constructors
	public CurrentAccount() {
	}

	public CurrentAccount(Owner owner, float balance, String number) {
		super( owner, balance, number);
	}

	public float getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public void print() {
		System.out.println("Current Account");
		this.getOwner().print();
		System.out.println("Balance: "+getBalance());
		System.out.println("Number: "+getNumber());
		System.out.println("Minimum Balance: "+getMinimumBalance());
	}

	@Override
	public void withdraw(float amount) {

		float balance = getBalance() - amount;
		if (balance > minimumBalance) {
			setBalance(balance);
			System.out.println("Withdrawl successful");
		} else {
			System.out.println("Unable to withdraw the amount!!!!");
		}
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance()+amount);		
	}
	
	public float getCharges() {
		return (float)(minimumBalance*0.05);
	}


}
