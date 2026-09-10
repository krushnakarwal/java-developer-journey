package com.jumping_statement;

public class Return_value 
{
	public int add()
	{
		return 10+20;
	}
	
	public static void main(String [] args)
	{
		Return_value obj = new Return_value();
		int result = obj.add();
		System.out.println(result);
	}
}
