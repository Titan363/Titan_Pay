package com.titanpay.accounting;

import java.util.ArrayList;

public class HourlyEmployee extends Employee implements Payable{
	
	public HourlyEmployee(int employeeID, String firstName, String lastName){
		super{employeeID, firstName, lastName};
		double hourlyRate = 0;
		double weeklyDues = 0;
	}
	ArrayList<TimeCard> timeCards = new ArrayList<>();
	
	public void clockIn(double currentDate,double currentTime){
		// create timecard, date, and starTime.
		timeCards.add(currentDate);
		timeCards.add(index: currentDate, date: currentDate);
		timeCards.add(index: currentDate, startTime: currentTime);
	}
	public void clockOut(double currentTime){
		timeCards.add(index: currentDate, endTime: currentTime);
		// find current date timecard and edit the endTime property
	}
	public void pay(){
		// sum up time card time
	}

}
