package com.java_basics;

public class Type_promotion_example {
	    public static void main(String[] args) {

	        byte a = 10;
	        byte b = 20;

	        int c = a + b;

	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);
	    }
	}

//  Type Promotion Complete Flow -->
//           Type Promotion means Java automatically converts a smaller
//           data type into a larger data type during an operation.
/*
│
├── byte + byte     → int
├── byte + short    → int
├── byte + char     → int
│
short
│
├── short + short   → int
├── short + char    → int
│
char
│
└── char + char     → int

int + int             → int
int + long            → long
int + float           → float
int + double          → double

long + long           → long
long + float          → float
long + double         → double

float + float         → float
float + double        → double

double + double       → double */
