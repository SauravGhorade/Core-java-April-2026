package com.java.core.StringDayTwo;

import java.util.Scanner;

public class Testone {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s =sc.next();
//		String s = "WEDNESDAY";

		System.out.println(s);

		for (int i =0 ; i <= s.length() -1; i++) {
//			if(i%2==0) {even or odd}
			
			System.out.println(s.charAt(i));
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		for (int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
}