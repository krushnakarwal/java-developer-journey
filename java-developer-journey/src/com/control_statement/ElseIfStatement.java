package com.control_statement;

import java.util.Scanner;

public class ElseIfStatement {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks...");
		float marks = sc.nextFloat();
		if(marks>=90)
		{
			System.out.println("Outstanding Performance");
		}
		else if(marks>=80)
		{
			System.out.println("A+ Grade");
		}
		else if(marks>=70)
		{
			System.out.println("A Grade");
		}
		else if(marks>=60)
		{
			System.out.println("B+ Grade");
		}
		else if(marks>=50)
		{
			System.out.println("B Grade");
		}
		else if(marks>=40)
		{
			System.out.println("C Grade");
		}
		else if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("bhaii yarrr tuuuu failll ho gayaa...");
		}
		
	   sc.close();
	}
	
}
