package com.sarvesh.jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306//servproj2";
		String uname="root";
		String pass="";
		String query="select PNAME from product where PID=101";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, uname, pass);
		Statement st = (Statement) con.createStatement();
		ResultSet rs= (ResultSet) st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("PNAME");
		System.out.println(name);
		
		st.close();
		con.close();
 	}

}
