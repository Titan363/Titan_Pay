package com.titanpay.accounting;

public class PickUpPayment extends PaymentMethod{
	// “A check for $’amount’ is waiting for ‘person’ at the PostMaster.”
	public void pay(String person, double amount){
		System.out.println("A check for $"+amount+" is waiting for {"+person+" at the PostMaster.");
	}
}
