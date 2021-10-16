package com.Test2;

import java.sql.*;

public class CluasesAggregate {

	public static void main(String args[]){
	    try{
	           
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onemonth","root","");
	         Statement s = con.createStatement() ;
	         
	         // Having 
	         ResultSet rs = s.executeQuery("SELECT book_name, price FROM products GROUP BY quantity HAVING price <= 12");
	         while(rs.next()) {
	             System.out.println(rs.getString(1)+ "  "+rs.getString(2));
	           }
	         
	         System.out.println();
	         
	         // Order BY
	         
	          rs = s.executeQuery("SELECT book_name, price FROM products ORDER BY  price DESC");
	         while(rs.next()) {
	             System.out.println(rs.getString(1)+ "  "+rs.getString(2));
	           }
	         System.out.println();
	         
	         //(SUB QUERIES) (AVG)  Average of top 4 product price price 
	         rs = s.executeQuery("SELECT AVG(t.price) FROM (SELECT price FROM products ORDER BY price DESC LIMIT 4) as t");
	         while(rs.next()) {
	             System.out.println(rs.getString(1));
	           }
	         System.out.println();
	         
	         //UPDATE  price by 30% whose quantity is below 5 (SUB QUERIES)
	        //s.executeUpdate("UPDATE products SET price = price *0.30 WHERE quantity IN ( SELECT quantity FROM products WHERE quantity <5)  ");
	        
	        // INNER JOin
	        
	        rs = s.executeQuery("SELECT products.book_name, posts.post_content,posts.post_title FROM products INNER JOIN posts ON products.ID = posts.post_author ");
	        while(rs.next()) {
	             System.out.println(rs.getString(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3));
	           }
	         System.out.println();
	         
	        // Get META DATA
	        rs = s.executeQuery("SELECT * FROM products");
	        ResultSetMetaData rsmd=rs.getMetaData();  
	        
	        System.out.println("Total columns: "+rsmd.getColumnCount());  
	        System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
	        System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
	         
	         
	         System.out.println("Program Successfull");
	         s.close();
	         con.close();  
	    }
	    catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error : "+e);

}
	}

}
