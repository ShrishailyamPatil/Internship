package com.testing;

import java.util.*;  

public class QueueEx {
	
	public static void show (PriorityQueue<Integer> queue) {
		 System.out.println("iterating the queue elements:"); 
		    
		    Iterator itr=queue.iterator();  
		    while(itr.hasNext()){  
		      System.out.print(itr.next()+ " ");  
		    }  
		    System.out.println();
	}
	public static void main(String args[]){  
	    PriorityQueue<Integer> queue= new PriorityQueue<Integer>();  
	    
	    queue.add(10);  
	    queue.add(20);  
	    queue.add(30);  
	    queue.add(40);  
	    queue.add(50);  
	    
	    System.out.println("head:"+queue.element());  
	    System.out.println(" first element of queue or head"+queue.peek());
	    
	    show (queue);
	    
	    System.out.println("Removed elements :");  
	    System.out.println(queue.remove()+ ","+ queue.poll());   // Remove the element
	    
	    show (queue);
}}
