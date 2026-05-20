package com.java.core.Array;

public class TestStringArray {
	public static void main(String[] args) {

		String[] days = { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };
//		System.out.println(days[1]);
//
//		System.out.println(days[3]);
//		
		for(int i=0;i<days.length;i++) {
			
//			String singleDay=days[i];
			if(days[i].startsWith("t")) {
			System.out.println(days[i]);
		}
		}

//		System.out.println(days[1]);
//		
//
//		System.out.println(days[1]);
//		
//
//		System.out.println(days[1]);
//		
//
//		System.out.println(days[1]);
	}

}
