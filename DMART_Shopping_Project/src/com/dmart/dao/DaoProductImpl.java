package com.dmart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoProductImpl implements IdaoProduct{
	
	@Override
	public void getAllProductDetails() throws ClassNotFoundException, SQLException {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/servproj2","root","");
		System.out.println("DB connected");
		
		stmt=(Statement) conn.createStatement(); 
		rs=(ResultSet) stmt.executeQuery("select * from product");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));

		conn.close();
	}

}
