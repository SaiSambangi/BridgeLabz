package com.bridgelabzDay01;


abstract class Bridge1{
	abstract void method1();
	abstract void method2();
	
}


abstract class Bridge2 extends Bridge1{
  
   public void method1() {
	   System.out.println("abstract method1");
   }
   
}

class Normal extends Bridge2{
public void method2(){
		System.out.println("abstract method1");
	}
}

public class AbstractionProgram {
	public static void main(String []args) {
		Normal obj=new Normal();
		obj.method1();
		obj.method2();
	}
}
