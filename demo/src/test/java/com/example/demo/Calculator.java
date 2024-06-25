package com.example.demo;

public class Calculator {

	
	// SUM
	
	public int doSum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	// Product
	
	public int doProduct(int a, int b)
	{
		return a*b;
	}
	
	public boolean isEqual(int a, int b)
	{
		if(a==b)
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}
}
