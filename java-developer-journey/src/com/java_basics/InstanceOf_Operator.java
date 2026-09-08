package com.java_basics;

 class Animal {
 }
 class Dog extends Animal {
 }
public class InstanceOf_Operator {

	    public static void main(String[] args) {

	        Animal a = new Dog();

	        System.out.println(a instanceof Dog);
	        System.out.println(a instanceof Animal);
	        System.out.println(a instanceof Object);
	    }
	}
