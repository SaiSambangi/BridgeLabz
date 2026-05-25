package com.bridgelabzDay01;

import java.util.Scanner;

class BridgeLabz {

	protected String mentor;
	private String student;
	private int studentId;
	private float marks;
	private String course;
	private int duration;

	

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	
	public String getMentor() {
		return mentor;
	}

	public void setStudent(String student) {
		this.student = student;
	}
	
	public String getStudent() {
		return student;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public float getMarks() {
		return marks;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
}

public class EncapsulationProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BridgeLabz b = new BridgeLabz();

		System.out.print("Enter Mentor Name: ");
		b.setMentor(sc.nextLine());
		

		System.out.print("Enter Student Name: ");
		b.setStudent(sc.nextLine());
		

		System.out.print("Enter Student Id: ");
		b.setStudentId(sc.nextInt());
		

		System.out.print("Enter Marks: ");
		b.setMarks(sc.nextFloat());
		

		sc.nextLine();

		System.out.print("Enter Course Name: ");
		b.setCourse(sc.nextLine());

		System.out.print("Enter Course Duration: ");
		b.setDuration(sc.nextInt());
		
		System.out.println("----------------------------------------------------");

		System.out.println(" BridgeLabz Student Details ");

		System.out.println("Mentor Name: " + b.getMentor());
		System.out.println("Student Name: " + b.getStudent());
		System.out.println("Student Id: " + b.getStudentId());
		System.out.println("Marks: " + b.getMarks());
		System.out.println("Course Name: " + b.getCourse());
		System.out.println("Course Duration: " + b.getDuration());

		
	}
}
