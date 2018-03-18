package com.caps.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import com.mysql.jdbc.Driver;

public class MineFirstJDBCProgram
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter your Registration Number");
		int regNo=Integer.parseInt(in.nextLine());

		System.out.println("Enter your First Name");
		String fname=in.nextLine();

		System.out.println("Enter your Last Name");
		String lname=in.nextLine();

		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			//I. Load the Driver
			java.sql.Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			//II. Get the DB connection via Driver
			String dbURL = "jdbc:mysql://localhost:3306/caps50_db?user=root&password=74123";
			con = DriverManager.getConnection(dbURL);

			//III. Issue the SQL query via connection
			String query="INSERT INTO person_info values(?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, regNo);
			pstmt.setString(2, fname);
			pstmt.setString(3, lname);

			int count=pstmt.executeUpdate();

			//IV. Process the Results
			if(count>0)
			{
				System.out.println("Data Inserted Successfully");
			}
			else
			{
				System.out.println("Failed to insert the data");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//V. Closing all the JDBC Objects
			try {
				if(pstmt!=null)
				{
					pstmt.close();
				}
				if(con!=null)
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
