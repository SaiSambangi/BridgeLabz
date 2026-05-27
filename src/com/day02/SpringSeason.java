package com.Day02;

import java.util.Scanner;

public class SpringSeason {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int m=sc.nextInt();
	int d=sc.nextInt();
	boolean ans=((m==3 && d>=20)||m==4 || m==5 || m==6 && d<=20);
	
	System.out.println(ans);
}
}
