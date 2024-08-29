package com.test.www;
import java.util.Scanner;

public class Studentsdetails {

	public static void main(String[] args) {
	Scanner Scanner = new Scanner(System.in);
	String CorrectUsername = "Ram";
	String CorrectPassword = "Ram@123";
	System.out.println("Enter CorrectUsername= ");
	String correctUsername = Scanner.nextLine();
	
	System.out.println("Enter CorrectPassword= ");
	String correctPassword = Scanner.nextLine();
	
	if (CorrectUsername.equals(correctUsername) && CorrectPassword.equals(correctPassword)){
		System.out.println("Login Successful");
	}
	else{
		System.out.println("Login Failed");
	}
	}
	
	}

