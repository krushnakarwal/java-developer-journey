// Print addition, subtraction, multiplication, integer division,
// and remainder of a = 20 and b = 6.



package com.operators_practice_programs;

import java.util.Scanner;

public class Basic_calculator 
{
	public void calculator(int choice,int a,int b)
	{
		switch(choice)
		{
		case 1:
			int result = a+b;
			System.out.println("Addition is = "+result);
			break;
			
		case 2:
			result = a-b;
			System.out.println("Substraction is = "+result);
			break;
			
		case 3:
			result = a*b;
			System.out.println("Multiplication is = "+result);
			break;
			
		case 4:
			result = a/b;
			System.out.println("Division is = "+result);
		    break;
		    
		case 5:
			result = a%b;
			System.out.println("Reminder is = "+result);
			break;
			
		default:
			System.out.println(" Invalid Input ");
		}
		
	}
	
	public static void main(String [] args)
	{
		Basic_calculator obj = new Basic_calculator();
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("1 : Addition");
	    System.out.println("2 : Substrction");
	    System.out.println("3 : Multiplication");
	    System.out.println("4 : Divisons");
	    System.out.println("5 : Remainder");
	    
	    System.out.println();
	    
	    System.out.print("Enter a choice number : ");
	    int choice = sc.nextInt();
	    
	    System.out.print("Enter a first number : ");
	    int a = sc.nextInt();
	    
	    System.out.print("Enter a second number : ");
	    int b = sc.nextInt();
		
	    obj.calculator(choice,a,b);
	    
	    sc.close();
	}

}
