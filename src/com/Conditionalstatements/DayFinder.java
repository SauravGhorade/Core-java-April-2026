package com.Conditionalstatements;

import java.util.Scanner;

public class DayFinder {
public static void main(String[] args) {
	//input is number eg 1
	//out put -->Monday
	Scanner sc=new Scanner(System.in);
   System.err.println("Enter a number between 1to 7");
	int input =sc.nextInt();
	
	if(input ==1) {
		System.out.println("Monday");
	}
	else if(input==2) {
		System.out.println("Tuesday");
	}
	else if (input==3) {
		System.out.println("Wednesday");
	}
	else if(input==4) {
		System.out.println("Thursday");
	}
	else if (input==5) {
		System.out.println("Friday");
		
	}
	else if(input==6) {
		System.out.println("Saturday");
		
	}
	else if(input==7) {
		System.out.println("Sunday");
	}
	else {
		System.out.println("Please enter a proper number...");
	}
}
}
