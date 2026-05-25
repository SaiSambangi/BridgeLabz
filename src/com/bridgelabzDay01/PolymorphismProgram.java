package com.bridgelabzDay01;

import java.util.Scanner;

class Bridgelab {

	public void display() {

		System.out.println("Welcome to BridgeLabz");
	}

	public void display(String mentorName) {

		System.out.println("Mentor Name : " + mentorName);
	}

	public void display(String studentName, int studentId) {

		System.out.println("Student Name : " + studentName);
		System.out.println("Student Id   : " + studentId);
	}
}

public class PolymorphismProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bridgelab b = new Bridgelab();

		System.out.print("Enter Mentor Name : ");
		String mentorName = sc.nextLine();

		System.out.print("Enter Student Name : ");
		String studentName = sc.nextLine();

		System.out.print("Enter Student Id : ");
		int studentId = sc.nextInt();

		System.out.println();

		b.display();

		b.display(mentorName);

		b.display(studentName, studentId);

		
	}
}