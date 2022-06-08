/*
 * create com.cashapona.objectcomposition on 06-jun-2022
 */
package com.cashapona.objectcomposition.jun06;
/**
 * @author Anuradha
 */
public class Customer {
	/*
	 * declare variables name,homeAddress,workAddress as private
	 * homeAddress and workAddress taken from Address class(Object composition)
	 */
	private String name;
	private Address homeAddress;
	private Address workAddress;
	/**
	 * creation of Custmoer class construcor
	 * @param name
	 * @param homeAddress
	 */
	public Customer(String name, Address homeAddress, Address workAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	@SuppressWarnings("unused")
	private void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	/**
	 * @param workAddress the workAddress to set
	 */
	void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	@Override
	public String toString() {
		return "Customer name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress;
	}
}
