package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Create Regex pattern that should clear given email samples
 *
 *@author Shivaji Ghasti
 *
 */
public class ValidEmail {
	public static void main(String[] args) {
		
	    ArrayList<String> email = new ArrayList<>();
	    email.add("abc@yahoo.com");
	    email.add("abc-100@yahoo.com");
	    email.add("abc.100@yahoo.com");
	    email.add("abc111@abc.com");
	    email.add("abc-100@abc.net");
	    email.add("abc.100@abc.com.au");
	    email.add("abc@1.com");
	    email.add("abc@gmail.com.com");
	    email.add("abc+100@gmail.com");
	    
	    //invalid emails
	    email.add("abc");
	    email.add("abc..");
	    email.add("abc..@gmail.com");
	    email.add("abc@abc@gmail.com");
	    email.add("abc@.com.my");
	    email.add("abc123@gmail.a");
	    email.add("abc123@.com");
	    email.add("abc123@.com.com");
	    email.add(".abc@abc.com");
	    email.add("abc()*@gmail.com");
	    email.add("abc..2002@gmail.com");
	    email.add("abc.@gmail.com");
	    email.add("abc@abc@gmail.com");
	    email.add("abc@gmail.com.1a");
	    email.add("abc..@gmail.com");
	    email.add("abc@gmail.com.aa.au");
	    
	    //For loop and Regex pattern to check valid and invalid Emails of Arraylist
	    
	    String reGex ="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
	    Pattern pattern = Pattern.compile(reGex);
	    
	    for (String str:email){
	        Matcher matcher=pattern.matcher(str);
	        if(matcher.matches()){
	            System.out.println("vaild email: "+ str + " :"+matcher.matches());
	            System.out.println();
	        }
	        else {
	        	System.out.println("");
	            System.out.println("Invaild email: "+ str + " :"+matcher.matches());
	            System.out.println();
	        }
	    }
	}
}
        
    






