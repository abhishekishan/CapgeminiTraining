package com.caps.etc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class HotelManagement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Customer ID");
		int custID=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Customer Name");
		String custName=sc.nextLine();

		System.out.println("Enter Email");
		String email=sc.nextLine();

		System.out.println("Enter Customer Address");
		String add=sc.nextLine();
		
		System.out.println("Room Type");
		String rType=sc.nextLine();

		System.out.println("Room Number");
		int rNum=Integer.parseInt(sc.nextLine());

		System.out.println("Enter Mobile Number");
		long mob=sc.nextLong();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			java.sql.Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			String dbUrl = "jdbc:mysql://localhost:3306/caps50_db?user=root&password=74123";
			con = DriverManager.getConnection(dbUrl);

			String query = "INSERT INTO CustomerDetails values(?,?,?,?,?,?,?)";
			if (rNum==101 || rNum==102 || rNum==103 || rNum==201 || rNum==202 || rNum==203)
			{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, custID);
			pstmt.setString(2, custName);
			pstmt.setString(3, email);
			pstmt.setString(4, add);
			pstmt.setLong(5, mob);
			pstmt.setString(6, rType);
			pstmt.setInt(7, rNum);
			
			int count=pstmt.executeUpdate();

			if(count > 0)
			{
				String query2="UPDATE RoomDetail SET Status='Booked' WHERE RoomNo=?";
				pstmt=con.prepareStatement(query2);
				pstmt.setInt(1, rNum);
				int count1=pstmt.executeUpdate();
				System.out.println("Data Inserted Successfully");
			}
			else
			{
				System.out.println("Failed to Insert Data");
			}
		}
			else
			{
				System.out.println("Invalid Room Number");
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

