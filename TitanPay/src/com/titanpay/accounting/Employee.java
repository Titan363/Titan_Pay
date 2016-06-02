// Sean Meinsen 
package com.titanpay.accounting;

public class Employee {
	
	public Employee(){
		int employeeID = 0;
		String firstName = "";
		String lastName = "";
		double hourlyRate = 0;
		double weeklyDues = 0;
	}
	public void getFullName(){
		System.out.println(Employee.lastName+ ", " + Employee.firstName);
	}

}
