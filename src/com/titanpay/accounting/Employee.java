// Sean Meinsen 
package com.titanpay.accounting;

public abstract class Employee {
	public Employee(){
		int employeeID = 0;
		String firstName = "";
		String lastName = "";
	}
	public void getFullName(Employee){
		System.out.println(Employee.lastName+ ", " + Employee.firstName);
	}
}