package com.firstproject;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database {
	public boolean insert(String name,String Email,String pass)
	{
		Connection con=null;
		boolean result=false;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sundar");
		String q="insert into login(UserName,Email,Password) values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setString(1,name);
		pst.setString(2,Email);
		pst.setString(3,pass);
		
		ResultSet rs=pst.executeQuery();
		result =rs.next();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return result;
		}
		
		return result;
				
	}
	public boolean check(String Email)
	{
		Connection con=null;
		boolean result= false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sundar");
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login");
			while(rs.next())
			{
				String e=rs.getString("Email");
				if(e.equals(Email))
				{
					return false;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	public boolean checklogin(String Email)
	{
		Connection con=null;
		boolean result= false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sundar");
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login");
			while(rs.next())
			{
				String e=rs.getString("Email");
				if(e.equals(Email))
				{
					return true;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return false;
	}

}
