package com.caps.jdkenh;

public class MainClassB
{
	public static void main(String[] args)
	{
		RunB ref=(int n) -> System.out.println(n);
		ref.count(6);
		SampleB.count(ref);
	}
}
