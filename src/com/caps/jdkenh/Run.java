package com.caps.jdkenh;

public interface Run
{
	public void test();
	
	public static void count()
	{
		System.out.println("This is static count() of Interface Run");
	}
	
	public default void view()
	{
		System.out.println("This is default view() of Interface Run");
	}
}
