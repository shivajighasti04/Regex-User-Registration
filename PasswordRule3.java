package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * 
 * Validate Password : As a User need to follow pre-defined Password rules. Rule
 * 3 – Should have at least 1 Numeric Number
 * 
 * @author Shivaji Ghasti
 * 
 */
public class PasswordRule3 {
	public static void main(String[] args) {
		System.out.println("Enter a password : ");
		Scanner sc = new Scanner(System.in);
		boolean result = Password(sc.nextLine());
		
		if(result) {
			System.out.println("User password is valid");
			
			}
		else {
			System.out.println("User password is invalid");
		}
	}
	public static boolean Password(String password) {
		return password.matches("(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*_.+-]{8,20}");
	}
}



