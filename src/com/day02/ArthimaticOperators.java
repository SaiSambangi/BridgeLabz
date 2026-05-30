package com.day02;

import java.util.Scanner;

public class ArthimaticOperators {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	

int exp1=a+b*c;
int exp2=c+a/b;
int exp3=a%b+c;
int exp4=a*b+c;

int val1=Math.max(Math.max(exp1, exp2),Math.max(exp3, exp4));
int val2=Math.min(Math.min(exp1, exp2),Math.min(exp3, exp4) );

System.out.println("MaxValue : "+val1);
System.out.println("MinValue : "+val2);


}
}
