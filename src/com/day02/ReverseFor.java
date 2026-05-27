package com.Day02;
import java.util.Scanner;
public class ReverseFor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int reverse=0;
	for(;n!=0;n/=10) {
		int temp=n%10;
		reverse=reverse*10+temp;
	}
	System.out.println("Reverse Number : "+reverse);
	
}
}
