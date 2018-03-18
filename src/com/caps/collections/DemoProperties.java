package com.caps.collections;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/db.properties");
		FileReader fr=null;
		Properties prop=new Properties();
		try
		{
			fr=new FileReader(f1);
			prop.load(fr);
			String val1=prop.getProperty("UserName");
			System.out.println(val1);
			String val2=prop.getProperty("Password");
			System.out.println(val2);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
