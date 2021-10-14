package com.testing;

import java.util.*;

class Stock implements Comparable <Stock>{
	String companyName;
	double price;
	int changePer ;
	
	Stock(String name , double price , int percentage){
		companyName= name;
		this.price = price;
		changePer=percentage;
	}
	
	public int compareTo(Stock st) { // compareto function  to sort by price
		if (price == st.price)
			return 0;
		else if (price> st.price)
			return 1;
		else
			return -1;
	}
	
}

public class comparableEx  {

	 public static void main(String args[]){  
		 
		 ArrayList<Stock> stocks = new ArrayList<Stock>();
		 
		 stocks.add(new Stock("Jio", 30.5f,-5));
		 stocks.add(new Stock("Tata", 50.9f,-3));
		 stocks.add(new Stock("Britina", 11.0f,7));
		 stocks.add(new Stock("Jack", 22.0f,2));
		 
		 
		 Collections.sort(stocks); // Takes only one argument
		 
		 for(Stock st : stocks) {
			 System.out.println(st.companyName+ " "+ st.price+ " "+ st.changePer);
		 }
	}

}
