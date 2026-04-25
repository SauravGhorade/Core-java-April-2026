package com.Conditionalstatements;

import java.util.Scanner;

public class ladderifCondition {
	public static void main(String[] args) {
		//int a = 100;
		// we need to print a numbers in words eg ip =5 then op=five
		// when u need to compare more than once then use ladder if
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0to6 : ");
		
		int a=sc.nextInt();
		
		if (a == 1) {
			System.out.println("One");
		} else if (a == 2) {
			System.out.println("Two");
		} else if (a == 3) {
			System.out.println("Three");
		} else if (a == 4) {
			System.out.println("Four");
		} else if (a == 5) {
			System.out.println("Five");
		} else {
			System.out.println("Enter number should be less than six");
		}

	}

}
