// Sean Meinsen 
package com.titanpay.accounting;

import java.util.ArrayList;

public class SalariedEmployee extends Employee implements Payable{
	
	public SalariedEmployee(int employeeID, String firstName, String lastName){
		super{employeeID, firstName, lastName};
		double salary = 0;
		double commissionRate = 0;
		double weeklyDues = 0;
	}
	ArrayList<Receipt> Receipts = new ArrayList<>();
	
	public double makeSale(double newAmt, double currentDate){
		// adds new receipts, dtae and amt properties
		Receipts.add(currentDate);
		Receipts.add(index: currentDate, amt: newAmt);
	}
	public void pay(){
		// sum up receipt commission using employees commission rate
	}
}
