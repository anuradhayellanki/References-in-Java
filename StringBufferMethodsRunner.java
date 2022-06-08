/**
 * com.cashapona.oops.strings on 07-jun-2022
 */
package com.cashapona.strings.jun07;
/**
 * @author Anuradha
 * created StringBufferMethodsRunner class 
 */
public class StringBufferMethodsRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*StringBuffer is mutable  or changable , Once we create string object that can be modified in same memory location
		* StringBuffer object can be created only with constructor
		* creates empty StringBuffer object and display
		*/
		StringBuffer stringBuffer=new StringBuffer();                                     
		System.out.println("Creates empty stringbuffer obj  "+stringBuffer);
		/*
		 * capacity(), return the current capacity
		 * default capacity of  StringBuffer is 16
		 */
		System.out.println("Capacity() stringbuffer obj : "+stringBuffer.capacity());      
		/*
		 * creates emptystring buffer obj with the given capacity				
		 */
		StringBuffer stringBuffer1=new StringBuffer(4);                                   
		System.out.println("creates empty stringbuffer with the given capacity : "+stringBuffer1.capacity());
		/*
		 * create stringBuffer object sb1 using new operator
		 */
		StringBuffer stringBuffer2=new StringBuffer("anu");
		System.out.println("original string : "+stringBuffer2);
		//print 19 , default size(16)+3=19
		System.out.println("capacity of the original string : "+stringBuffer2.capacity());   
		/*
		 * create stringbuffer obj by passing null value, leads to NullPointerException
		 */
		try
		{
			StringBuffer stringBuffer3=new StringBuffer(null);             
			System.out.println(stringBuffer3);
		}
		catch(NullPointerException e)
		{					
			System.out.println(e);
		}
		/*
		 *  Comparision of s1==s2 (Reference comparision only) and s1.equals(s2) in StringBuffer
		 */
		StringBuffer stringBuffer4=new StringBuffer("Anu");
		StringBuffer stringBuffer5=new StringBuffer("Anu");
		System.out.println(" StringBuffer anu==anu returns : "+(stringBuffer4==stringBuffer5));
		/*
		 * equals() method meant for reference/address comparision. references of both pointing to different so returns false
		 * In StringBuffer equals() method is not overriden
		 */
		System.out.println("In StringBuffer , equals() method is for reference of two strings : "+stringBuffer4.equals(stringBuffer5));
		/*
		 * length()   ,StringBuffer  default capacity is 16
		 */
		StringBuffer stringBuffer6=new StringBuffer("anuradha");
		System.out.println("Length() StringBuffer :  "+stringBuffer6.length());       
		/*
		 * charAt(index), return the character at the specified position.
		 */
		System.out.println("charAt(2nd posi) :  "+stringBuffer6.charAt(2));   
		/*
		 * setChatAt(index,char) , modify character at particular index posi
		 */
		stringBuffer6.setCharAt(0,'t');             
		System.out.println("StringBuffer : "+stringBuffer6);           
		System.out.println("setChatAt(0 posi,t char) : "+stringBuffer6);           
		/*
		 * append() , can add string/float/int /boolean values
		 */
		System.out.println("StringBuffer : "+stringBuffer6);           
		System.out.println("append() with 1.12 : "+stringBuffer6.append(1));
		/*
		 * insert(posi,string) , insert string at particular posi
		 */
		System.out.println("insert(1,aadvik) to anuradha : "+stringBuffer6.insert(1,"aadvik"));
		/*
		 * delete(int startIndex, int endIndex), delete from strating index to end-1 index
		 */
		StringBuffer stringBuffer7=new StringBuffer("Keerthana");
		System.out.println("StringBuffer : "+stringBuffer7);           
		System.out.println("delete(2,4)  : "+stringBuffer7.delete(2,4));
		/*
		 * reverse(), used to reverse the string.
		 */
		System.out.println("reverse() of Anu : "+stringBuffer7.reverse());
	}
}




	


