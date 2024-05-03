package com.learn.junit.in.five.steps;

public class SampleMath {
  
	public int calculateSum(int[] numbers)
	{
		int sum = 0;
		for(int number : numbers)
		{
			sum += number;
		}
		return sum;
	}
}
