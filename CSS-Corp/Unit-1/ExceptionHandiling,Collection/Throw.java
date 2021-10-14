package com.testing;

import java.util.Scanner;

public class Throw {

	 public static void main(String args[]) {
		 
		 try {
				Scanner sc = new Scanner(System.in);
				
			    int a = sc.nextInt(); 
			    
			    if (a==0) {
			    	
			    	throw new ArithmeticException();
			    	
			    }
			    
			    int b= 40/a;
			    
			    System.out.println(b);
			    
			    
		 
		 }
		 catch (ArithmeticException e) {
			 System.out.println("Divide by 0: " + e);
		 }
		 
		 finally {
			 System.out.println("Code finshed");
		 }
		  }
}
