package com.Conditionalstatements;

import java.util.Scanner;

public class DayFinderUsingSwitchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number between 1 to 7");
		int input = sc.nextInt();

		switch (input) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("ENTER PROPER NUMBER");
		}
	}

}
//assignment enter month using switch case and Scanner
