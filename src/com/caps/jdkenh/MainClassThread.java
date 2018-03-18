package com.caps.jdkenh;

public class MainClassThread
{
	public static void main(String[] args)
	{
		Runnable r1=() -> System.out.println("Thread-1");
		Runnable r2=() -> System.out.println("Thread-2");
		Runnable r3=() -> System.out.println("Thread-3");
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2= new Thread(r2);
		t2.start();
		
		Thread t3=new Thread(r3);
		t3.start();
	}
}
