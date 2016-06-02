// Sean Meinsen 
package com.titanpay.accounting;

public class BankAccount {

	public BankAccount(){
		String bankName = "";
		double routingNumber = 0;
		String accountID = "";
	}
	
	public void deposit(double amount){
		System.out.println("Depositing $" +amount+ " in "+ BankAccount.bankName+ " Account Number: "+ BankAccount.accountID+ " using Routing Number: " + BankAccount.routingNumber);
	}
}
