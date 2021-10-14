package com.testing;

public class keyword {
	String car_name;
	int ID ;
	static String fuel_type = "Diesel"; //static variable
	
	public enum mode { sports, eco, comfort} // defining enum 
	static void change(){  
	      fuel_type = "Petrol";  
	   } 
	final void run () { // final function
		System.out.println("running");
	}
	
	keyword(String name, int id){
		car_name = name;
		ID = id;
	}
	 public static void main(String args[]) {
		 keyword.change();
		 keyword car = new keyword("Austin Martin ", 254);
		 
		 System.out.print(car.car_name+ " of fuel type "+ car.fuel_type+" have modes ");
		 for (mode m : mode.values()) { 
			    System.out.print(m+", ");  }
		 
		 car.run();
			
		 
		 
	}

}
