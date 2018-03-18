package com.caps.jdkenh;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClassStreamsAPI
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		
		for(int i=1; i<=100; i++)
		{
			a1.add("Hello"+i);
		}
		
		List<String> f1=a1.parallelStream().filter(str -> str.length() > 6).collect(Collectors.toList());
		
		f1.forEach(st1 -> System.out.println(st1));
	}
}
