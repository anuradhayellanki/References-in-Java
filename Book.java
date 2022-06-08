/*
 * create com.cashapona.objectcomposition on 06-jun-2022
 */
package com.cashapona.objectcomposition.jun06;
/**
 * @author Anuradha
 */
import java.util.ArrayList;
/*
 * create Book class
 */
public class Book {
	/*
	 * create fields id as int, name as String, author as String type of Book class
	 */
	private int id;
	private String name;
	private String author;
	/*
	 * create ArrayList object and store reviews from Review class
	 */
	private ArrayList<Review> reviews =new ArrayList<>();
	/**
	 * create consructor for Book class
	 * @param id
	 * @param name
	 * @param author
	 * @param review
	 */
	public Book(int id, String name, String author ){
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	/*
	 * @param review of Review class
	 */
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author +", Reviews="+reviews+ "]";
	}
	
}
