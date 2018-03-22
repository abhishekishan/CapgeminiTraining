package com.caps.jdbc;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.mysql.jdbc.Driver;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("C:\\Users\\abhis\\Desktop\\Jsp\\CPG Training\\FileDemo\\db.properties");
		Properties prop = new Properties();
		prop.load(fr);

		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			java.sql.Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			String dbURL = "jdbc:mysql://localhost:3306/caps50_db";
			con = DriverManager.getConnection(dbURL,prop);

			String query="SELECT * FROM person_info";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);

			while(rs.next())
			{
				int regno=rs.getInt("regNo");
				String fname=rs.getString("firstName");
				String lname=rs.getString("lastName");
				System.out.println(regno+" "+fname+" "+lname);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(stmt != null)
				{
					stmt.close();
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
