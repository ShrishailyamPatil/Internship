package com.testing;

import java.util.*;


public class SetEx {

	 public static void main(String[] args)
	    {   Set<Integer> set1 = new HashSet<Integer>();        
	        set1.add(1);
	        set1.add(53);
	        set1.add(36);
	        set1.add(36);
	        set1.add(43);
	        set1.add(1);
	        
	        
	        Set<Integer> set2 = new HashSet<Integer>();
	        
	        set2.addAll(Arrays.asList(new Integer[]  {1,3,36,5,5,83,43 }));
	        System.out.println(set1);
	        System.out.println(set2);
	        
	        // Union of sets
	        Set<Integer> union = new HashSet<Integer>(set1);
	        union.addAll(set2);
	        System.out.println(union);
	        
	        
	     // Intersection of sets
	        Set<Integer> intersection = new HashSet<Integer>(set1);
	        intersection.retainAll(set2);
	        System.out.println(intersection);
	    }

}
