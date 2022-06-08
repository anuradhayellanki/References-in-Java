/*
 * create com.cashapona.objectcomposition on 06-jun-2022
 */
package com.cashapona.objectcomposition.jun06;
/**
 * @author Anuradha
 */
public class Review {
	/*
	 * declare fields id as int type,description as String type ,rating as int type
	 */
	private int id;
	private String description;
	private int rating;
	/**
	 * create constructor for Review class
	 * @param id
	 * @param description
	 * @param rating
	 */
	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}
	
}
