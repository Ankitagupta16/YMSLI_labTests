package com.accountapp.dao;

public class SavingAccount extends Account {

	private float interestRate=10;

	//constructors
	public SavingAccount() {
	}

	public SavingAccount(Owner owner, float balance, String number) {
		super( owner, balance, number);
	}

	//getter
	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public void print() {
		System.out.println("Saving Account");
		this.getOwner().print();
		System.out.println("Balance: "+getBalance());
		System.out.println("Number: "+getNumber());
		System.out.println("Interest Rate: "+getInterestRate());
		
	}

	@Override
	public void withdraw(float amount) {

		float balance = getBalance() - amount;
		if (balance > 0) {
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


	public float getInterest() {
		return interestRate*this.getBalance();
	}

	
}
