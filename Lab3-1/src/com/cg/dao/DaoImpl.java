package com.cg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.bean.Bean;
import com.cg.util.Util;

public class DaoImpl implements Dao {

	Connection con=Util.getConnect();
	
	@Override
	public ArrayList<Bean> getAll() {
		ArrayList<Bean> al = new ArrayList<Bean>();
		String qry="select * from Training";
		
		try
		{
			Statement stmt =con.createStatement();
			ResultSet rs= stmt.executeQuery(qry);
			while(rs.next())
			{
				al.add(new Bean(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return al;
	}

	@Override
	public void enroll(int trainingId, int available) {
		String query="update Training set AvailableSeats="+available+" where trainingId="+trainingId;
		try {
			Statement s= con.createStatement();
			s.executeUpdate(query);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
