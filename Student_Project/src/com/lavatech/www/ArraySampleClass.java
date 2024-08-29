package com.lavatech.www;

public class ArraySampleClass {

	public static void main(String[] args) {
		//Array Declaration+initialization in 1 step
		String[][][] CountryDetails = {
				  {	  {"Mumbai","99Cr"},
					  {"Delhi","64Cr"},
					  {"Pune","77Cr"}},
				  
				  {   {"Boston","3Cr"},
			          {"New Jersey","5Cr"}},
				};
		System.out.println(CountryDetails[0][0][0]);
		System.out.println(CountryDetails[0][0][1]);
		
		System.out.println(CountryDetails[0][1][0]);
		System.out.println(CountryDetails[0][1][1]);
		
		System.out.println(CountryDetails[0][2][0]);
		System.out.println(CountryDetails[0][2][1]);
		
		System.out.println(CountryDetails[1][0][0]);
		System.out.println(CountryDetails[1][0][1]);
		
		System.out.println(CountryDetails[1][1][0]);
		System.out.println(CountryDetails[1][1][1]);
		
	}
}
