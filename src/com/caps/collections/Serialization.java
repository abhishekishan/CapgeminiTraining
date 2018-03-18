package com.caps.collections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization
{
	public static void main(String[] args)
	{
		Student s1=new Student(1,"Abhi");
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Student.ser");
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream(f1);
			out= new ObjectOutputStream(fout);
			out.writeObject(s1);
			System.out.println("Object Written");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
