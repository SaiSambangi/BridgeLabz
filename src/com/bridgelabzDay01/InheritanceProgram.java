package com.bridgelabzDay01;

class BridgeLabz1 {

	String mentor = "Prakash";
}

class Student extends BridgeLabz1 {

	String student = "Sai";

	public void display() {

		System.out.println("Mentor Name : " + mentor);
		System.out.println("Student Name : " + student);
	}
}

public class InheritanceProgram {
public static void main(String []args) {
	

		Student s = new Student();

		s.display();
	}
}
