package com.Day02;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int reverse=0;
	while(n!=0) {
		int temp=n%10;
		reverse=reverse*10+temp;
		n/=10;
	}
	System.out.println("Reverse Number : "+reverse);
}
}
