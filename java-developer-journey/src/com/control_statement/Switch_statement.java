package com.control_statement;

import java.util.Scanner;

public class Switch_statement {
	public static void main( String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number :");
		float num1 = sc.nextFloat();
		System.out.println("Enter a second number :");
		float num2 = sc.nextFloat();
		
		System.out.println("1: Addition");
		System.out.println("2: Subbstraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Reminder");
		
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			float result = num1+num2;
			System.out.println("Addition is : "+result);
			break;
		case 2:
			result = num1-num2;
			System.out.println("Addition is : "+result);
			break;
		case 3:
		    result = num1*num2;
			System.out.println("Addition is : "+result);
			break;
		case 4:
			result = num1/num2;
			System.out.println("Addition is : "+result);
			break;
		case 5:
			result = num1%num2;
			System.out.println("Addition is : "+result);
			break;
		default:
			System.out.println("Invalid Input");
		
		}
	}

}
