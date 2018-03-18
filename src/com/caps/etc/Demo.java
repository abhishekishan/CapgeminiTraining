package com.caps.etc;

import java.util.Arrays;

public class Demo
{
	public static void main (String[] args) 
	{
		String st=new String("a");
		String st1=new String("a");
	    String a="a";
	    String b="a";
	    String c="b";
	    System.out.println(a.equals(c));
	    int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2,3};
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
	}
}

