package com.titanpay.accounting;

public class DirectDepositPayment extends PaymentMethod{
	// “ ” check bank account methods
	public void pay(double amount, String bankName, double accountID, double routingNumber){
		System.out.println("Depositing $" +amount+ " in "+ bankName+ " Account Number: "+ accountID+ " using Routing Number: " +routingNumber);
	}
}
