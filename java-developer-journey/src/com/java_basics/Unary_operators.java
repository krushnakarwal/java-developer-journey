package com.java_basics;

public class Unary_operators {
	    public static void main(String[] args) {

	        // Unary Plus (+)
	        int a = 10;
	        System.out.println("Unary Plus (+a) = " + (+a));

	        // Unary Minus (-)
	        System.out.println("Unary Minus (-a) = " + (-a));


	        // Pre & Post Increment (a++)
	        int b = 10;
	        System.out.println("Pre Increment (++b) = " + (++b));
	        System.out.println("Post Increment (b++) = " + (b++));
	        System.out.println("After b++ = " + b);
	        

	        // 5. Pre & Post Decrement (d--)
	        int d = 10;
	        System.out.println("Pre Decrement (--d) = " + (--d));
	        System.out.println("Post Decrement (d--) = " + (d--));
	        System.out.println("After d-- = " + d);


	        // Logical NOT (!)
	        boolean x = true;
	        System.out.println("Logical NOT (!x) = " + (!x));


	        // Bitwise NOT (~)
	        int f = 5;
	        System.out.println("Bitwise NOT (~f) = " + (~f));
	    }
}
	

	