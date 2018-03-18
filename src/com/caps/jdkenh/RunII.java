package com.caps.jdkenh;

public interface RunII extends RunI
{
public void count();

	@Override
	public default void view()
	{
		System.out.println("This is default view() of RunII");
	}
}
