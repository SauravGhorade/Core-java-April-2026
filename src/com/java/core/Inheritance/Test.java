package com.java.core.Inheritance;

public class Test {
	public static void main(String[] args) {
//		Child
		Shubham ss = new Shubham();
		System.out.println(ss.b);
		System.out.println(ss.a);
		System.out.println(ss.c);
		System.out.println(ss.d);
		System.out.println(ss.age);
		
		System.out.println("-----------------------");
//		Parent
		Student a = new Student();
		System.out.println(a.age);
	}

}
