package com.caps.collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo/Student.ser");
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream(f1);
			in=new ObjectInputStream(fin);
			Object ob=in.readObject();
			Student st=(Student)ob;
			System.out.println("Id: "+st.id);
			System.out.println("Name: "+st.name);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
