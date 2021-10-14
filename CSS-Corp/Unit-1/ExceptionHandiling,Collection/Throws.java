package com.testing;

public class Throws {
	
	static void throwsFun() throws IllegalAccessException{
        System.out.println("Inside throwsFun function.");
        throw new IllegalAccessException("This is a exception deal with it.");
    }

	 public static void main(String args[]) {
			 
			 try {
				 throwsFun();
			 }
			 catch (IllegalAccessException e) {
		          System.out.println("Caught " + e);
		      }
		}

}
