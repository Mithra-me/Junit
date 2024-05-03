package com.learn.junit.in.five.steps;

public class SimpleOperations{
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public boolean isPositive(int number)
	{
		return number > 0;
	}
	
	public String getEmptyString()
	{
		return null;
	}
	public String getHello()
	{
		return new String("Hello");
	}
	
	public int[] getArray()
	{
		return new int[] {1,2,3};
	}
	
	public String getHelloLiteral()
	{
		return "Hello";
	}

}
