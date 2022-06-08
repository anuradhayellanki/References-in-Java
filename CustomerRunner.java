/*
 * create com.cashapona.objectcomposition on 06-jun-2022
 */
package com.cashapona.objectcomposition.jun06;
/**
 * @author Anuradha
 * create CustomerRunner class
 */
public class CustomerRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creation of Address class object reference homeAddress with values
		Address homeAddress=new Address("Ecil","Hyderabad","5000062");
		Address homeAddress1=new Address("Kakani palem","Addanki","523201");
		Address workAddress=new Address("Madhapur","Hyderabad","5000035");
		//creation of Customer class object reference customer with values
		Customer customer=new Customer("Anuradha",homeAddress1, workAddress);
		Customer customer1=new Customer("Ravi",homeAddress, workAddress);
		System.out.println(customer);
		System.out.println(customer1);
	}
}
