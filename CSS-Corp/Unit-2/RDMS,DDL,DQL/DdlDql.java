package com.Test2;

import java.sql.*;

public class DdlDql {

	public static void main(String args[]){
	    try{
	           
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/states","root","");
	         Statement s = con.createStatement() ;
	         // DDL
	         
	         //Create a table name 'user'
	         s.execute(" CREATE TABLE `user` (  `ID` bigint(20) NOT NULL, `user_login` varchar(60) COLLATE utf8mb4_unicode_520_ci NOT NULL,`user_pass` varchar(255) COLLATE utf8mb4_unicode_520_ci NOT NULL,`user_nicename` varchar(50) COLLATE utf8mb4_unicode_520_ci NOT NULL,`user_email` varchar(100) COLLATE utf8mb4_unicode_520_ci NOT NULL) ");
	         
	         // Altering the data	      
	         s.execute("ALTER TABLE user MODIFY user_email varchar(50) NULL");
	         
	         // Droping a column
	         s.execute(" ALTER TABLE user Drop user_nicename");
	         
	         //Rename table name
	         s.execute("ALTER Table user RENAME TO user_info");
	         
	         //Empty the table  table name
	         s.execute("TrunCate Table user_info");
	         
	       //Empty the table  table name
	         s.execute("DROP TABLE user_info");
	         
	         
	        // DQL
	         
	         // Show all elements in table 
	         ResultSet rs = s.executeQuery("SELECT * FROM states");
	         while(rs.next()) {
	         System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
	         }
	         
	      // (WHERE) Show states who drink is Milk in table 
	          rs = s.executeQuery("SELECT state FROM states WHERE drink = 'Milk'  ");
	         while(rs.next()) {
	         System.out.println(rs.getString(1) );
	         }
	         
	         
	         System.out.println("Program Successfull");
	         s.close();
	         con.close();  
	        }catch(ClassNotFoundException | SQLException e){
	            
	            System.out.println("Error : "+e);

		
	}

}
}
