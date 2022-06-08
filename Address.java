/*
 * create com.cashapona.objectcomposition on 06-jun-2022
 */
package com.cashapona.objectcomposition.jun06;
/**
 * @author Anuradha
 */
public class Address {
	/*
	 * declare fields lane as String, city as String, zip as String of private type
	 */
	private String lane;
	private String city;
	private String zip;
	/**
	 * create constructor for Address class
	 * @param line
	 * @param city
	 * @param zip
	 */
	public Address(String lane, String city, String zip) {
		super();
		this.lane = lane;
		this.city = city;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "[lane=" + lane + ", city=" + city + ", zip=" + zip + "]";
	}
	
}
