package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * 
 * Validate Email Id : As a User need to enter Email has 3 mandatory parts (abc,
 * bl & co) and 2 optional (xyz & in) with precise @ and . positions Ex.
 * abc.xyz@bl.co.in
 * 
 *@author Shivaji Ghasti
 *
 */
public class Email {
	public static void main(String[] args) {
		System.out.println("Enter a Email Id");
		Scanner sc = new Scanner(System.in);
	    boolean result = Email(sc.nextLine());
	    if(result) {
	    	System.out.println("User email id valid");
	    	
	    }
	    else {
	    	System.out.println("User email id invalid ");
	    }		
	}
	public static boolean Email(String email) {
		return email.matches("^[a-z]{3}[A-Za-z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]*$*");
	}
}

		
		


 