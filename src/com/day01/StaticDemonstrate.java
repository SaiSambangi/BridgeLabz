package com.day01;

public class StaticDemonstrate {
	
	static int a=10;
	static {
		System.out.println("This is Static Block");
	}
	
	static void method() {
		System.out.println("This is Static method");
		System.out.println("a :   "+a);
	}
	
	
public static void main(String[] args) {
	method();
}
}
