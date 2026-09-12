package com.control_statement;
import java.util.Scanner; 
public class NestedIfStatement {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
	

	if(age>=18) 
	{
		
		System.out.println("Enter driving test score : ");
		int test_score = sc.nextInt();
		
		if(test_score>=60)
		{
			System.out.println("License can be issued");
		}
		else
		{
			System.out.println("Try again later..");
		}
		
		
	}
	else
	{
		System.out.println("Not eligible for license testing");
	}
	
	sc.close();
	}
}
