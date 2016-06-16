// Sean Meinsen 
package com.titanpay.accounting;

public class TimeCard {
	
	public TimeCard()
	{
		String date = "";
		String startTime= "";
		String endTime= "";
	}
	
	public double calculateDailyPay( double rate){
		// Calculate hours from time
		double overTimeHours = 0;
		double payRateBase = 0;
		double payRateExcess = 0;
		double hoursWorked = 0;
		// calculate  hours * rate for under 8 hours
		payRateBase = hoursWorked *rate;
		// calculate hours * (rate * 1.5) for time over 8 hours
		// must subtract excess hours from original 8
		if (hoursWorked > 8){
			overTimeHours = hoursWorked - 8;
			payRateExcess = overTimeHours * (rate*1.5);
		}
		return payRateExcess + payRateBase;
	}
}
