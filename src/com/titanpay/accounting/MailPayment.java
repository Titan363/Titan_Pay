package com.titanpay.accounting;

public class MailPayment extends PaymentMethod{
		// “Mailing a check to ‘person’ for $‘amount’ to ‘address’.”
	public void pay(String person, double amount, String address){
		System.out.println("Mailing a check to "+ person +" for $"+amount+" to "+address+".");
	}
}
