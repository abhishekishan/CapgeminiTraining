package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Test3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter RegNo to change the password");
		int regno=Integer.parseInt(sc.nextLine());

		System.out.println("Enter the old Password");
		String pass=sc.nextLine();

		System.out.println("Enter the New password");
		String password=sc.nextLine();		

		Connection con = null;
		PreparedStatement pstmt = null;
		try 
		{
			java.sql.Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			String dbUrl = "jdbc:mysql://localhost:3306/caps50_db?user=root&password=74123";
			con = DriverManager.getConnection(dbUrl);

			String query = "UPDATE  person_otherinfo SET password=? where regno=? AND password=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, password);
			pstmt.setInt(2, regno);
			pstmt.setString(3, pass);

			int count = pstmt.executeUpdate();
			if(count > 0)
			{
				System.out.println("Password Changed Successfully");
			}
			else
			{
				System.out.println("Failed to Change the Password");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)
				{
					pstmt.close();
				}
				if(con != null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
	}
}
