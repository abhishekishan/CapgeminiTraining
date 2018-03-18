package com.caps.etc;

public class Pattern
{
	public static void main(String[] args)
	{
		print(4);
	}
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int b=i;
			for(int j=1;j<=n+1;j++)
			{
				if(j==1)
				System.out.print(b);
				else
					System.out.print(b+1);
			}
			System.out.println();
		}
	}
}

