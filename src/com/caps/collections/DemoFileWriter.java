package com.caps.collections;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Java.txt");
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(f1);
			fw.write("Data1");
			fw.write("Data2");
			fw.write("Data3");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.flush();
				fw.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
