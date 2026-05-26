package com.day01;

import java.util.*;
public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	if(n<1582) {
		System.out.println("please enter the number greater than or equal to 1582");
		
	}else if((n%4==0 && n%100!=0) || (n%400==0)) {
		System.out.println(n+" is a Leap Year");
	}else {
		System.out.println(n+" is not a Leap Year");
		
	}
}
}
