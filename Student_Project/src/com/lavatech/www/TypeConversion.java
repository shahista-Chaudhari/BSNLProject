package com.lavatech.www;

public class TypeConversion {
	public static void main(String [] args) {
	byte b1 = 34;
	short s1 = b1;
	
	System.out.println(s1);	
	
	double d1 = 3467866.784d;
	byte b2 = (byte) d1;
	System.out.println(b2);
	}
}
