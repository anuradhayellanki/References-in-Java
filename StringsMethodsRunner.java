/**
 * com.cashapona.oops.strings on 07-jun-2022
 */
package com.cashapona.strings.jun07;
import java.util.Scanner;
/**
 * @author Anuradha
  */
public class StringsMethodsRunner {
	 /*
	 * create string1, string2 objects using new operator
	 */
	static String string1=new String("This is my String class");
	static String string2=new String("anu radha");
	/*
	 * create string object string3 using literal
	 */
	static String string3="Anuradha";
	static Scanner scanner=new Scanner(System.in);
	/*
	 * concat(), concatenates the specified string
	 */
	static public void concat() {
		string1.concat(string2);
		System.out.println("After concat() not assigning to any variable : "+string1);
		string1=string1.concat(string2);
		System.out.println("After concat() assigning to string1 variable : "+string1);
	}
	/*
	 * charAt(index), returns char value for the particular index
	 */
	static public void charAt() {
		System.out.println("Which position charactor you want ");
		int index=scanner.nextInt();
		System.out.println("charAt() "+index+" position is : "+string1.charAt(index));
	}
	/*
	 * isEmpty(), checks if string is empty.
	 */
	static public void isEmpty() {
		System.out.println("String1 : "+string1);
		System.out.println("Check string is empty : "+string1.isEmpty());
	}
	/*
	 * length(), returns the length of a string
	 */
	static public void length() {
		System.out.println("String1 : "+string1);
		System.out.println("Length of string1 : "+string1.length());
	}
	/*
	 * substring(beginIndex,endIndex), returns substring for given beginindex and endindex.
	 */
	static public void substring() {
		System.out.println("Enter begin index");
		int beginIndex=scanner.nextInt();
		System.out.println("Enter End index");
		int endIndex=scanner.nextInt();
		System.out.println("substring("+beginIndex+" , "+endIndex+" ) : "+string1.substring(beginIndex,endIndex));
	}
	/*
	 * contains(), returns boolean value for the particular string
	 */
	static public void contains() {
		System.out.println("Enter string ");
		String s=scanner.next();
		System.out.println("String contains "+s+"  : "+string1.contains(s));
	}
	/*
	 * replace() , replaces old value with new one value
	 */
	static public void replace() {
		System.out.println("Replace anu with sai "+string1.replace("anu","sai"));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Select option from menu ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int  chioce;
		do {
			System.out.println("1. concat()");
			System.out.println("2. charAt()");
			System.out.println("3. isEmpty()");
			System.out.println("4. length()");
			System.out.println("5. substring()");
			System.out.println("6. contains()");
			System.out.println("7. replace()");
			System.out.println("8. exit()");
			System.out.println("Enter your chioce : ");
       	    chioce =sc.nextInt();
			switch(chioce) {
				case 1:  
					concat();
					break;
				case 2: 
					charAt();
					break;
				case 3: 
					isEmpty();					
					break;
					
				case 4:
					length();
					break;
				case 5:
					substring();
					break;
				case 6:
					contains();
					break;
				case 7:
					replace();
					break;
				case 8:
					break;
				default : 
					System.out.println("Invallid selection, Try again");
				}
		}while(chioce!=8);
	}
}




	


