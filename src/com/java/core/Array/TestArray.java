package com.java.core.Array;
import java.util.Arrays;
public class TestArray {
	public static void main(String[] args) {
		
		int[] heights = {10,20,30,40};
		
//		
//		System.out.println(heights.length);
//		
//		System.out.println(heights[0]);
//		System.out.println(heights[1]);
//		System.out.println(heights[2]);
//		System.out.println(heights[3]);
//		
		
		System.out.println("---------------------------------------------------------");
		
		
		for (int i=0;i<heights.length;i++) {
			
//			System.out.println("Value at index "+i+"="+heights[i]);
//			System.out.println(heights[i]);
			
			if (heights[i]%2==0) {
				System.out.println(heights[i]+"is even");
			}
			else {
				System.out.println(heights[i]+"is odd");
			}
		}
		
	}

}
