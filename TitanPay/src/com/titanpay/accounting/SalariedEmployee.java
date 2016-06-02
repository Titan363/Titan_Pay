// Sean Meinsen 
package com.titanpay.accounting;

public class SalariedEmployee {
	
	public SalariedEmployee(){
		int employeeID = 0;
		String firstName = "";
		String lastName = "";
		double salary = 0;
		double commissionRate = 0;
		double weeklyDues = 0;
	}
	public void getFullName(){
		System.out.println(Employee.lastName+ ", " + Employee.firstName);
	}

}
