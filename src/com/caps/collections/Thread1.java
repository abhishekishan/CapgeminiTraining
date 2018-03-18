package com.caps.collections;

public class Thread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Within run Method Thread1");
		for(int i=1; i <= 10; i++)
		{
			System.out.println("i= "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
