package com.caps.collections;
import java.io.File;
import java.io.IOException;

public class DemoFile3
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Student.ser");
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
