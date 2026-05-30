package com.day03;

import java.util.Scanner;
public class SmallestElement {
	
	
		public static int  largest(int []arr) {
			int min=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
				
			}
			return min;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println((largest(arr)));
	}

}
