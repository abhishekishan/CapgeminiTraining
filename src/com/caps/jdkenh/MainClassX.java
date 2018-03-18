package com.caps.jdkenh;

public class MainClassX
{
	public static void main(String[] args)
	{
		RunX ref=(int n1, int n2) ->
	                                      	{
			                                    int res=n1+n2;			                                    
			                                    return res;
	                                     	};
		int x=ref.add(10, 40);
		System.out.println(x);
	}
}
