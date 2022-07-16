package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Validate Mobile number : As a User need to follow pre-defined Mobile Format
 * Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
 * digit number
 *
 *@author Shivaji Ghasti
 *
 */
 public class ValidateMobileNo {
	 public static void main(String[] args) {
			System.out.println("Enter a mobile no : ");
			Scanner sc = new Scanner(System.in);
			boolean result = MobileNo(sc.nextLine());
			if(result) {
				System.out.println("User mobile no is valid");
			}
			else {
				System.out.println("User mobile no is invalid");
			}
	 }
		public static boolean MobileNo(String mobileno) {
			return mobileno.matches("[0-9]{2}[\\s{1}][0-9]{10}$");
		}
}
