package com.caps.collections;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Java.txt");
		FileReader fr=null;
		try
		{
			fr=new FileReader(f1);
			int res=fr.read();
			while(res!=-1)
			{
				System.out.print((char)res);
				res=fr.read();
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
