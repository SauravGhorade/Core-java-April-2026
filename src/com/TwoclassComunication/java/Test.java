package com.TwoclassComunication.java;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First name:");
		String fname = sc.next();
		System.out.println("Enter Lat name:");
		String lname = sc.next();
		System.out.println("Enter age:");
		int yob = sc.nextInt();

		Student s = new Student();
		String username=s.getStudent(fname,lname,yob);
		System.out.println("Student is:" +username);

	}

}
