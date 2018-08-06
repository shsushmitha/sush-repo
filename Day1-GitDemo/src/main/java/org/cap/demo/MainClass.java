package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesClass class1=new SalesClass();
		Complete class2=new Complete();
		Complete_Updated class4=new Complete_Updated();
		branch4 cl=new branch4();
		cl.okay();
		System.out.println("Hello World!");
		greet();
		class1.show();
		class2.Display();
		class4.updated();
	}
	
	public static void greet() {
		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("Be happy");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
