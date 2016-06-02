// Sean Meinsen 
package com.titanpay.accounting;

public class Address {
	
	public Address(){
		String streetAddress = "";
		String city = "";
		String state = "";
		int zip = 0;
	}
	
	public String getAddress(){
		System.out.println(Address.streetAddress +' '+ Address.city + ", " + Address.state + Address.zip);
	}

}
