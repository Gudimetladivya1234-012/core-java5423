package com.tns.exceptions;

public class NestedTry {
	public static void check () {
	String str="tns";
	int slength=str.length(); 
	
	System.out.println("the length is"+slength);
	String anotherString="null";
	int s1=anotherString.length();
			System.out.println("the length is"+s1);		
	int y=6;
	try {
		int z=y/0;
		try {
			System.out.println(str.charAt(y));
			
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("IndexOutofBounds"+ex.getMessage());
		}
		catch (NullPointerException ex) {
			System.out.println("NullPointer Exception"+ex.getMessage());
		}
		
	}
	catch(ArithmeticException ex) {
		System.out.println("Arithmetic Exception"+ex.getMessage());
		}
	}

}
