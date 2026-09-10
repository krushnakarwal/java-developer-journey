package com.jumping_statement;

public class Return_statement {
	
		public void checkNumber(int number)
		{
			if(number < 0)
			{
				return;
			}
          System.out.println("Number is positive : "+number);
		}
		
		public static void main(String [] args)
		{
			Return_statement obj = new Return_statement();
			obj.checkNumber(10);
	}
}
