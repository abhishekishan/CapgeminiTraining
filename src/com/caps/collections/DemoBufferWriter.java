package com.caps.collections;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferWriter
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Java.txt");
		FileWriter fw=null;
		BufferedWriter b=null;
		try
		{
			fw=new FileWriter(f1);
			b=new BufferedWriter(fw);
			b.write("Data4");
			b.write("Data5");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				b.flush();
				fw.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
