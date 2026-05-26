package com.day01;

public class SumCommand {
public static void main(String[] args) {
	
	
	int sum=0;
	int validInput=0;
	for(String s:args) {
		
		//to handle the expection we are using the try and catch block here....
		try {
	          int n=Integer.parseInt(s);
	          sum=sum+n;
	          
		}catch(NumberFormatException e) {
			validInput++;
		}
	}
	System.out.println("sum:  "+sum);
	System.out.println("Invalid Integers:  "+validInput);	
} 
}
