package com.inheritance.bll;

public class SalaryAccount implements BankAccount{
	private double balance;

	public SalaryAccount() {
		super();
		
	}
	//set balance
		
		public SalaryAccount(double balance) {
			super();
			this.balance = balance;
		}
		@Override
		public double getBalance() {
			return balance;
			
		}
		@Override
		public void deposit(double amount) {//deposit
			balance += amount;
		}
		
		@Override
		//withdrawal
		public boolean withdraw(double amount) {//balance can be minimum 0
			if(balance >= amount) {
				balance -= amount;
				return true;
			}
			return false;
		}
}

	



