package com.Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlDcl {
	
	 
	

	public static void main(String args[]){
	    try{
	           
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/states","root","");
	         Statement s = con.createStatement() ;
	         
	         
	        
	         
	         
	       //Create a table name 'user'
	        s.execute(" CREATE TABLE `house` (  `ID` bigint(20) NOT NULL, `house_name` varchar(60) COLLATE utf8mb4_unicode_520_ci NOT NULL,`house_no` int(40) NOT NULL,`rooms` bigint(10) NOT NULL,`price` decimal(10,2) NOT NULL) ");
	         
	       // Insert data in table
	         s.executeUpdate("INSERT INTO house (ID,house_name,house_no, rooms, price)VALUES(1,'abc',12,3,2004.75),(2,'efg',34,2,1353.05),(3,'hij',21,2,1231.33),(4,'klmn',28,1,4324.00),(5,'opqr',8,3,2487.72)");
	         
 
	    		 
	    		 
	         ResultSet rs = s.executeQuery("SELECT * FROM house");
	          while(rs.next()) {
	             System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
	           }
	         
	        // Update the values in table
	          s.executeUpdate("UPDATE house SET rooms = 4 where price > 4000");
	          
	          rs = s.executeQuery("SELECT * FROM house");
	          while(rs.next()) {
	             System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
	           }
	          
	          
	          //(LIKE) Deleting the  rows which ends with 'r' (WildCard) in table
	          s.executeUpdate("DELETE FROM house WHERE house_name LIKE '%r'");
	          
	          
	          rs = s.executeQuery("SELECT * FROM house");
	          while(rs.next()) {
	             System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
	           }
	          
	          
	          // Distinct(Unique) drinks in table 
	          rs = s.executeQuery("SELECT DISTINCT(drink) FROM states   ");
	          while(rs.next()) {
		             System.out.println(rs.getString(1));
		           }
	          
	          // GROUP BY
	          rs = s.executeQuery("SELECT drink,Count(state) FROM states GROUP BY drink  ");
	          while(rs.next()) {
		             System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  ");
		           }
	          
	          // Limit and order by
	          rs=s.executeQuery("SELECT house_name from house ORDER BY price DESC LIMIT 2");
	          while(rs.next()) {
		             System.out.println(rs.getString(1));
		           }
	          
	          
	         System.out.println("Program Successfull");
	         s.close();
	         con.close();  
	        }catch(ClassNotFoundException | SQLException e){
	            
	            System.out.println("Error : "+e);

	}

}
	}
