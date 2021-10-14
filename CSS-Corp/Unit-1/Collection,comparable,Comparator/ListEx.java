package com.testing;

import java.util.*;  

public class ListEx {

	public static void main(String args[]){  
	      ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist 
	      
	      list.add(10); 
	      list.add(20);  
	      list.add(30);  
	      list.add(40); 
	      list.add(50);
	        
	      Iterator itr=list.iterator();  
	      while(itr.hasNext()){  
	         System.out.print(itr.next()+" ");  
	    }  

	      System.out.println("\nElement at 3rd place:"+ list.get(2));
	  }  
	    
	  
}
