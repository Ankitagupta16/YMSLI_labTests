package com.accountapp.controller;

import com.accountapp.dao.Account;
import com.accountapp.dao.CurrentAccount;
import com.accountapp.dao.Date;
import com.accountapp.dao.Owner;
import com.accountapp.dao.SavingAccount;

public class AccountTester {

	public static void main(String[] args) {
		
		//------creating date objects---------
		Date date1= new Date(02,10,2004);
		Date date2= new Date(02,11,1999);
		
		//------creating Owner objects---------
		Owner ankita = new Owner("Ankita Gupta",date1,"WQS456");
		Owner sweta = new Owner("Sweta Tripathy ",date2,"STY456");
		
		//------creating Account objects---------
		Account account1 = new SavingAccount(ankita,1000,"1234");
		Account account2 = new CurrentAccount(sweta,10000,"5678");
		
		//----------manipulation with account1----------------
		account1.print();
		System.out.println("Balance before Deposit:  "+account1.getBalance());
		account1.deposit(500);
		System.out.println("Balance after Deposit:  "+account1.getBalance());
		
		System.out.println("----------------------------------");
		
		//----------manipulation with account2----------------
		account2.print();
		System.out.println("Balance before withdrawal:  "+account1.getBalance());
		account1.withdraw(1800);
		System.out.println("Balance after withdrawal:  "+account1.getBalance());
	}
}
