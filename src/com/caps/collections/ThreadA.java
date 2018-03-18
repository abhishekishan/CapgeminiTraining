package com.caps.collections;

public class ThreadA implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Within run Method ThreadA");
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
