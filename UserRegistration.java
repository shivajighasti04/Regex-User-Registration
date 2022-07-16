package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * 
 * As a User need to follow pre-defined Password rules. Rule1 – minimum 8
 * Characters
 * 
 * @author Shivaji Ghasti
 */
public class UserRegistration {
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
		return password.matches("[0-9a-zA-Z!@#$%^&*_.+-]{8,15}");
	}
}
	


