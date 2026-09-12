package com.java_basics;

import java.util.Scanner;

public class Scanner_Class {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number : ");
		int num2 = sc.nextInt();
		Scanner_Class obj = new Scanner_Class();
		obj.add(num1,num2);
		
		sc.close();
	}
	
		public void add(int a,int b)
		{
			int result = a+b;
			System.out.println("addition is : "+result);
		}
		
	}


