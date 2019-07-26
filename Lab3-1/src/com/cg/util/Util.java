package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	
	//Used For Connection with Database
	
	static Connection con;
	
	static 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user="hr";
			String pass="hr";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("Database Connected Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConnect()
	{
		return con;
	}
	

}
