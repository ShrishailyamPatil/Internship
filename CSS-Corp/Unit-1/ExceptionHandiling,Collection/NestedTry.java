package com.testing;

import java.util.Scanner;

public class NestedTry {

	 public static void main(String args[]) {
		  try {
			Scanner sc = new Scanner(System.in);
			
		    int a = sc.nextInt();
		    int b = 32 / a;
		    System.out.println("a = " + a);
		    try { // nested try block
		      if (a == 1)
		         a = a / (a - a); // division by zero
		      if (a == 2) {
		        int c[] = { 1 };
		        c[20] = 99; //outofbound
		      }
		    } 
		    catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println("Array index out-of-bounds: " + e);
		    }
		  } 
		  catch (ArithmeticException e) {
		     System.out.println("Divide by 0: " + e);
		  }
		  }

}
