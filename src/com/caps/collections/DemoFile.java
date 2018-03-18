package com.caps.collections;
import java.io.File;

public class DemoFile
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/abhis/Desktop/Jsp/CPG Training/FileDemo");
		boolean res=f1.mkdir();
		System.out.println("Folder Created: "+res);
	}
}
