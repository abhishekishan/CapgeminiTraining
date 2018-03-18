package com.caps.collections;
import java.io.File;
import java.io.IOException;

public class DemoFile2
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/db.properties");
		try 
		{
			boolean res=f1.createNewFile();
			System.out.println("File Created: "+res);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
