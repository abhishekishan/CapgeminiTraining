package com.caps.collections;

public class DemoThreadArg
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		ThreadA refa=new ThreadA();
		Thread ref1=new Thread(refa);
		ref1.start();
		ThreadB refb=new ThreadB();
		Thread ref2=new Thread(refb);
		ref2.start();
		System.out.println("Main Method Ended");
	}
}
