package com.testing;

public class Tarray {
	
	public void show1d (int[] arr) {
		for(int i:arr){
		      System.out.print(i+ " ");
		}
		System.out.println(); 
	}
	
	public void show2d (int [][] arr) {
		for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(arr[i][j]+" ");  
			 }  
			 System.out.println();  
			}  
	}
	

	public static void main(String args[]){  
		int one[] = { 1,2,3,4,5,6}; // 1D array
		int two[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // 2D array
		int[] copy;
		copy = new int[10];
		
		System.arraycopy(one,0,copy,0,4);
		
		Tarray t = new Tarray();
		System.out.println("first 1D array");
		t.show1d(one);
		System.out.println("Copied array");
		t.show1d(copy);
		
		System.out.println("2D array");
		t.show2d(two);
	}

}
