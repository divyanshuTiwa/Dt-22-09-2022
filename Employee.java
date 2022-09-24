package com.inheritance.bll;

public abstract class Employee {
	private String name;
	private String jobtitle;


	public Employee() {
		
	}
		public Employee(String name, String jobtitle) {
			this.name = name;
			this.jobtitle = jobtitle;
		
		}
		public String getName() {
			return name;
	 }
		
		public String getJobtitle() {
			return jobtitle;
	 }
		
		public void setName(String name) {
			this.name = name;
	 }
		
		public void setJobtitle(String jobtitle) {
			this.jobtitle = jobtitle;
	 }
		public abstract double calculatePay();
		@Override
		public String toString()  {
			return "Employee Name - "+ name + "\nJobTitle - "+ jobtitle;
		}
		
	 }



