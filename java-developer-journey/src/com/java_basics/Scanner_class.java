package com.java_basics;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number : ");
		int num2 = sc.nextInt();
		Scanner_class obj = new Scanner_class();
		obj.add(num1,num2);
	}
		
		public void add(int a,int b)
		{
			int result = a+b;
			System.out.println("addition is : "+result);
		}
	}


