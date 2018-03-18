package com.caps.jdkenh;

 interface RunI
{
	public void count();
	
	public default void view()
	{
		System.out.println("This is default view() of RunI");
	}
}
