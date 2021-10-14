package com.testing;

import java.util.regex.Pattern; 
import java.util.Scanner; 
import java.util.regex.Matcher;

public class RegexEx {

	public static void main(String[] args){  
	      Scanner sc=new Scanner(System.in);   
	            
	      System.out.println("Enter regex pattern:");   
	      Pattern pattern = Pattern.compile(sc.nextLine());   //Pattern taken in
	      System.out.println("Enter text:");     
	      Matcher matcher = pattern.matcher(sc.nextLine());  // the word to match 
	      boolean found = false;
	      int b= 0;
	      while (matcher.find()) {             
	        System.out.println("The text "+matcher.group()+" starts at index "+ matcher.start()+" and endis at index "+matcher.end());         
	        found = true; 
		b++;
	      } 
		
	      if(!found){     
	       System.out.println("No match found.");   
	     } else{
		System.out.println("found."+ b + " times");
	      }
	   sc.close();   
	}

}
