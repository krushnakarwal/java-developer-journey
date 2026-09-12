package com.java_basics;

public class LogicalOperator {
	public static void main(String [] args) {
		
		int age = 21;
		String  name = "Krish";
		
		System.out.println(age == 21 && name == "Krish");
		System.out.println(age <= 18 || name == "Krushna");
		System.out.println(!( age <= 18 ));
	}

}
