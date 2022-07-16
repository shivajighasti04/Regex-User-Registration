package com.bridgelabz.regex;

import java.util.Scanner;
/**
 * 
 * First name start with capital letter and has minimum 3 character
 * 
 *@author Shiavji Ghasti
 *
 */
public class UserFirstName {
	public static void main(String[] args) {
		System.out.println("Enter a User Name : ");
		Scanner sc = new Scanner(System.in);
		boolean result = FirstName(sc.nextLine());
		if(result) {
			System.out.println("User registration is valid");
		}
		else {
			System.out.println("User registation is invalid");
		}
	}
	public static boolean FirstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z,A-Z]{2,}$");
	}
}



