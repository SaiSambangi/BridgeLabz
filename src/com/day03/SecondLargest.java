package com.day03;

import java.util.Scanner;
public class SecondLargest {



		public static  int[]	secondLargestElement(int[]arr){
			
			if(arr.length<2) {
				return new int[]{-1,-1};
			}
				int max1=Integer.MIN_VALUE;
				int max2=Integer.MIN_VALUE;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]>max1) {
						max2=max1;
						max1=arr[i];
					}else if(arr[i]>max2 && arr[i]<max1) {
						max2=arr[i];
					}
				}
				if(max2==Integer.MIN_VALUE) {
					return new int[] {-1,-1};
				}
				return new int[]{max1,max2};
			}
			
			
			
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
		   int result[] =  secondLargestElement(arr);
		   System.out.println("Largest :   "+result[0]);
		   System.out.println("Second Largest :   "+result[1]);
		}
		}



