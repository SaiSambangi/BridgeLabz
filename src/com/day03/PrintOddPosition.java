package com.day03;

import java.util.Scanner;
public class PrintOddPosition {


		public static void  oddNumbers(int []arr) {
			for(int i=1;i<arr.length;i+=2) {
				System.out.print(arr[i]+"  ");			
			}
		}
		
		
		
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			oddNumbers(arr);
		}

	}




