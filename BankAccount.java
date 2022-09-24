package com.inheritance.bll;
/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * 
 * @author admin
 *
 *
 **/

public interface BankAccount {


			public  double getBalance();
			public void deposit(double amount);
			 boolean  withdraw(double amount);
				
	}


