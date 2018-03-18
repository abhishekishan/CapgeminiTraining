package com.caps.collections;

public class ThreadMethods
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		Thread ref=Thread.currentThread();
		System.out.println(ref.getName());
		System.out.println(ref.getId());
		System.out.println(ref.getPriority());
		ref.setName("Thread-1");
		System.out.println(ref.getName());
		ref.setPriority(8);
		System.out.println(ref.getPriority());
	}
}
