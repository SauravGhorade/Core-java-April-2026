package com.Scanner;

import java.util.Scanner;

public class TestScanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int as a input
	System.out.println("Please enter your year of birth:");
	int yob=sc.nextInt();
	
	System.out.println("Input given is:"+ yob);
	
	
	
	
	
	//String as a input
	System.out.println("Enter city name:");
	String city=sc.next();
	System.out.println("City is : "+city);
}
}
