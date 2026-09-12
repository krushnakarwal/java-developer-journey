// Calculate the square and cube of a given number n = 5.

package com.operators_practice_programs;

import java.util.Scanner;

public class Square_and_cube_calculator 
{
	public void square_and_cube (int number)
	{
		System.out.println("Square of that number is : "+ number * number);
		System.out.println("Cube of that number is : "+ number * number * number);		
	}
	
	public static void main(String [] args)
	{
		Square_and_cube_calculator obj = new Square_and_cube_calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt(); 
		
		obj.square_and_cube(num);
		
		sc.close();
		
	}
}
