package com.caps.collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Java.txt");
		FileReader fr=null;
		BufferedReader b=null;
		try
		{
			fr= new FileReader(f1);
			b=new BufferedReader(fr);
			String res=b.readLine();
			while(res!=null)
			{
				System.out.println(res);
				res=b.readLine();
			}
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
