package com.arrays;

public class JaggedArray 
{
	 public static void main(String[] args) 
	 {
	    
	        int[][] jagged = 
	        	{
	                {10, 20},          
	                {30, 40, 50, 60},  
	                {70, 80, 90}       
	            };

	        for (int row = 0; row < jagged.length; row++) 
	        {
	            for (int col = 0; col < jagged[row].length; col++) 
	            {
	                System.out.print(jagged[row][col] + " ");
	            }
	            System.out.println(); 
	        }
	 }     

}
