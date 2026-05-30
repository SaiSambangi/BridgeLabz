package com.day03;

import java.util.Scanner;

public class SortAscendingOrder {
	
	
	public static int[] sortTheArray(int []arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int flag=0;
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}		
		return arr;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	
 arr=sortTheArray(arr);
 for(int ans:arr) {
	 System.out.print(ans+"    ");
 }
}
}
