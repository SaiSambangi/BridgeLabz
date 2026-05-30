package com.day02;
import java.util.*;
public class Quadratic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	
	double delta = b*b - 4*a*c;
	if(delta < 0) {

	    System.out.println("Imaginary Roots");

	} else {

		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		
	    System.out.println("Root 1 : " + root1);
	    System.out.println("Root 2 : " + root2);

	}
	

}
}
