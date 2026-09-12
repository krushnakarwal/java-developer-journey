package com.operators_practice_programs;

import java.util.Scanner;

public class RectangleMetrics 
{
	public void area_and_perimeter(int length,int width)
	{
		System.out.println("Area of reactangle : "+ length*width);
		System.out.println("Perimeter of rectangle : "+ (2*(length+width)));
	}
	
	public static void main(String [] args)
	{
		RectangleMetrics obj = new RectangleMetrics();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a length of rectangle: ");
		int length = sc.nextInt();
		
		System.out.println("Enter a width of rectangle : ");
		int width = sc.nextInt();
		
		obj.area_and_perimeter(length,width);
		
		sc.close();
	}
}



