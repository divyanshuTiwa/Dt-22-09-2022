package com.inheritanceinterfaces.bll;

import com.inheritance.bll.Employee;

//HourlyEmployee class extends Employee.


public class HourlyEmployee extends Employee {

		private int hoursworked;
		private int payrate;
		
		public HourlyEmployee() {
			super();
			
		}
		public HourlyEmployee(int hoursworked, int payrate, String name, String jobtitle) {
			super(name,jobtitle);
			this.hoursworked = hoursworked;
			this.payrate = payrate;
			
		}
		public int getHoursWorked() {
			return hoursworked;
			
		}
	
		public int getPayrate() {
			return payrate;
		}
		public void setHoursWorked(int hoursworked) {
			this.hoursworked = hoursworked;
		}
		public void setPayrate(int payrate) {
			this.payrate = payrate;
		}
		@Override
		public double calculatePay() {
			return hoursworked*payrate;
		}
	}
