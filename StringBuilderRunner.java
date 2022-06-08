/**
 * com.cashapona.oops.strings on 07-jun-2022
 */
package com.cashapona.strings.jun07;
/**
 * @author Anuradha
 */
public class StringBuilderRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * creation StringBuilder object 
		 * StringBuilder creates mutable objects, thread safety is not required 
		 */
		StringBuilder stringBuilder=new StringBuilder("Shree Keerthana");
		/*
		 * append(), means concatinaton
		 */
		stringBuilder.append(" yellanki");
		System.out.println("After append() StringBuilder : "+stringBuilder);
		/*
		 * reverse(), reverse a string
		 */
		System.out.println("StringBuilder : "+ stringBuilder.toString());
		StringBuilder stringBuilder1=stringBuilder.reverse();
		System.out.println("Reverse String : "+ stringBuilder1.toString());
		/*
		 * insert(), insert a string in particular position
		 */
		StringBuilder stringBuilder2=new StringBuilder("Hello ");  
		System.out.println(stringBuilder2);
		stringBuilder2.insert(1," Java ");
		System.out.println(stringBuilder2);
		/*
		 * replace(), given string from the specified beginIndex and endIndex.
		 */
		stringBuilder2.replace(0, 3," ravi ");
		System.out.println("After replace() : "+stringBuilder2);
		/*
		 * delete(), deletes the string from the specified beginIndex to endIndex.
		 */
		stringBuilder2.delete(5, 9);
		System.out.println("After delete() : "+stringBuilder2);
		/*
		 * capacity(), returns the current capacity of the Builder
		 */
		System.out.println("capacity() : "+stringBuilder2.capacity());
		/*
		 * length(), returns the length of string
		 */
		System.out.println("StringBuilder : "+stringBuilder2);
		System.out.println("length() : "+stringBuilder2.length());
	}
}
