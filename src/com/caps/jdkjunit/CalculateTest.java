package com.caps.jdkjunit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculateTest
{
	@Test
	public void testAreaOfCircle()
	{
		double res=Calculate.areaOfCircle(3);
		System.out.println(res);
		Assert.assertEquals(28.278, res);
	}
	
	@Test
	public void testAreaOfSquare()
	{
		int res=Calculate.areaOfSquare(3);
		System.out.println(res);
		Assert.assertEquals(9, res);
	}
}
