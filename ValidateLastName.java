package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * 
 * Valid Last Name - Last name starts with Cap and has minimum 3 characters
 * 
 * @author Shivaji Ghasti
 *
 */
public class ValidateLastName {
	public static void main(String[] args) {
		System.out.println("Enter a User Name : ");
		Scanner sc = new Scanner(System.in);
		boolean result = LastName(sc.nextLine());
		if(result) {
			System.out.println("User registration is valid");
		}
		else {
			System.out.println("User registation is invalid");
		}
	}
	public static boolean LastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
}
