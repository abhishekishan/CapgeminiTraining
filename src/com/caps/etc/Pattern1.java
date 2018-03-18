package com.caps.etc;

public class Pattern1
{
	public static void main(String[] args)
	{
		printPattern(6);
	}
	static void printPattern(int n)
	{
		int k=1;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				for(int j=1; j<=2*i-1; j++)
				{
					if(j%2==0)
						System.out.print("*");
					else
					{
						System.out.print(k);
						k++;
					}
				}
			}
			else
			{
				int b=k+i-1;
				for(int j=1; j<=2*i-1; j++)
				{
					if(j%2==0)
						System.out.print("*");
					else
					{
						System.out.print(b);
						b--;
						k++;
					}
				}
			}
			System.out.println();
		}
	}
	/*static void printPattern(int n)
	{
		int b=1;
		for(int i=1; i<=n; i++)
		{
			int k=b;
			for(int j=1; j<=i; j++)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
			b=b+i+1;
		}
	}*/
}
