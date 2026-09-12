// Find the area of a circle with radius r = 7. (Formula: 3.14 × r × r).

package com.operators_practice_programs;

import java.util.Scanner;

public class CircleArea 
{
	public void  circle_area(Double radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	
	public static void main(String [] args)
	{
		CircleArea obj = new CircleArea();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a radius : ");
		Double r = sc.nextDouble();
		
		obj.circle_area(r);
		
		sc.close();
	}

		
}
