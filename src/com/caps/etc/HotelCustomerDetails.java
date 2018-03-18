package com.caps.etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class HotelCustomerDetails
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Customer ID");
		int custID=Integer.parseInt(sc.nextLine());
		
		Connection con=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.PreparedStatement pstmt1=null;
		ResultSet rs=null;
		ResultSet rs1=null;
		try
		{
			java.sql.Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			String dbURL = "jdbc:mysql://localhost:3306/caps50_db?user=root&password=74123";
			con = DriverManager.getConnection(dbURL);

			String query="SELECT * FROM CustomerDetails where custID=?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, custID);
			rs=pstmt.executeQuery();

			if (rs.next())
			{
				String custName=rs.getString("custName");
				int rNum=rs.getInt("RoomNo");
				long mob=rs.getLong("MobileNo");
				String email=rs.getString("Email");
				String rType=rs.getString("RoomType");
				System.out.println("Name of the Customer : "+custName);
				System.out.println("Email ID : "+email);
				System.out.println("Mobile Number : "+mob);
				System.out.println("Room Number : "+rNum);
				System.out.println("Room Type : "+rType);
				String query1="SELECT * FROM RoomDetail WHERE RoomNo=?";
				pstmt1=con.prepareStatement(query1);
				pstmt1.setInt(1, rNum);
				rs1=pstmt1.executeQuery();
				if(rs1.next())
				{
					String status=rs1.getString("Status");
					System.out.println("Booking Status : "+status);
				}
						
				
				System.out.println("****************************");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				pstmt.close();
				pstmt1.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}	
	}	
}
