package com.caps.collections;

public class DemoThread
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		Thread1 ref1=new Thread1();
		ref1.start();
		Thread2 ref2=new Thread2();
		ref2.start();
		System.out.println("Main Method Ended");	
	}
}
