package com.caps.jdkenh;

public class Sample1 implements Run1,Run2
{
	/*@Override
	public void count()
	{
		System.out.println("This is an oveerridden count() in Sample Class");
	}*/
	
	public void count()
	{
		Run1.count();
		Run2.count();
	}
}
