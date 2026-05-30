package com.day03;

import java.util.Scanner;
public class DuplicateElements {


		
		
		
		public static void frequency(int[]arr) {
			
		int freq[]=new int[1000];
		for(int i:arr) {
			freq[i]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(freq[arr[i]]!=0 && freq[arr[i]]>1) {
			System.out.println(arr[i]+"-->"+freq[arr[i]]);
			freq[arr[i]]=0;
			}
		}	
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		frequency(arr);
	}
	}


