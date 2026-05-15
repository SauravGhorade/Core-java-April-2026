package com.java.core.MiniProjects;

import java.util.Scanner;

public class EmailValidator {
	public static void main(String[] args) {
		System.out.println("Enter email Address : ");
		Scanner sc=new Scanner(System.in);
		String email =sc.next();
		
		String originalEmail="wednesday@gmail.com";
		if(originalEmail.equalsIgnoreCase(email)) {
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
	}

}
