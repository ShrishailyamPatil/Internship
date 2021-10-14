package com.testing;

public class MultiCatchBlock {

	public static void main (String args[]) {
		try {
		    int a = args.length;
		    System.out.println("a = " + a);
		    int b = 30 / a;
		    int c[] = { 1 };
		    c[15] = 99;
		  }
		  catch (ArithmeticException e) {
		    System.out.println("Divide by 0: " + e);
		  } 
		  catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Array index oob: " + e);
		  }
		  finally{
		    System.out.println("After try/catch blocks.");
		  }
	}

}
