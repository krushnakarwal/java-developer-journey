// Gross salary calculation. Basic = 40000. HRA is 12% of basic, DA is 8% of basic. Deduct PF of 3500.


package com.operators_practice_programs;

import java.util.Scanner;

public class SalarySlip 
{
	public void Gross_Salary(int basic_salary)
	{
		double HRA = (basic_salary * 12)/100;
		double DA = (basic_salary * 8)/100;
		double Gross_salary = basic_salary + HRA + DA ;
		double PF = 3500;
	    double Net_salary = Gross_salary - PF;
		
		System.out.println("Basic Salary is :"+basic_salary);
		System.out.println("HRA is :"+HRA);
		System.out.println("DA is :"+DA);
		System.out.println("PF is :"+PF);
		System.out.println("Gross Salary is :"+Gross_salary);
		System.out.println("Net Salary is :"+Net_salary);
	}
	
	public static void main(String [] args)
	{
		SalarySlip obj = new SalarySlip();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your basic salary :");
		int basic_salary = sc.nextInt();
		
		obj.Gross_Salary(basic_salary);
		
		sc.close();
	}
	

}
