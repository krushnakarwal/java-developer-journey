// Find Simple Interest for Principal = 12000, Rate = 7.5%, Time = 3 years.


package com.operators_practice_programs;

public class SimpleInterest 
{
	public void intrest_calculate()
	{
		double principle = 12000,rate = 7.5,time = 3;
		double si = principle*rate*time/100;
		
		System.out.println("Simple Intrest is :"+si);
	}
	
	public static void main(String [] args)
	{
		SimpleInterest obj = new SimpleInterest();
		obj.intrest_calculate();
	}
}
