package com.arrays;

public class TwoDimensionalArray 
{
	 public static void main(String[] args) 
	 {
	        
	       int[][] matrix = 
	    	   { 
	    		  {10, 20, 30}, 
	              {40, 50, 60} 
	           };
	    
	       for (int row = 0; row < matrix.length; row++) 
	       {
	            for (int col = 0; col < matrix[row].length; col++) 
	            {
	                System.out.print(matrix[row][col] + " ");
	            }
	            System.out.println(); 
	       }
	 }

}
