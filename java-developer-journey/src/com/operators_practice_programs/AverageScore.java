// Calculate the average of 5 subject Total marks and average.

package com.operators_practice_programs;

import java.util.Scanner;

public class AverageScore 
{
	public void average_score(float java,float python,float cpp,float sql,float c)
	{
		float total_marks = java+python+cpp+sql+c;
		float average = total_marks /5.0f;
		
		System.out.println("Total marks is : "+ total_marks);
		System.out.println("Average is : "+ average);
		
	}
	
	public static void  main(String [] args)
	{
		AverageScore obj = new AverageScore();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a java marks :");
		float java = sc.nextFloat();
		
		System.out.println("Enetr a python marks :");
		Float python = sc.nextFloat();
		
		System.out.println("Enter a cpp marks :");
		Float cpp = sc.nextFloat();
		
		System.out.println("Enter a sql marks :");
		Float sql = sc.nextFloat();
		
		System.out.println("Enter a c marks :");
		Float c = sc.nextFloat();
		
		obj.average_score(java,python,cpp,sql,c);
		
		sc.close();
	}

}
