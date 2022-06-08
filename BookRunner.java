/*
 * create com.cashapona.objectcomposition on 06-jun-2022
 */
package com.cashapona.objectcomposition.jun06;
/**
 * @author Anuradha
 */
public class BookRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book=new Book(1,"OOPs with Java","Nageswara Rao");
		Review review1=new Review(10,"Great Book",4);
		Review review2=new Review(11,"Okay not bad",2);
		book.addReview(review1);
		book.addReview(review2);
		System.out.println(book);
	}
}
