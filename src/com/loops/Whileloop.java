package com.loops;

public class Whileloop {
public static void main(String[] args) {
	
//	execution sequence for loop 
//	initialization 
//	condition
//	code/ for loop body
//	incre/decre
	
	for (int i=0;i<5;i++) {
		System.out.println("Hello in for loop :"+i);
	} 

	System.out.println("----------------------------------------------------------------");

//initialization ,, condition and incre / decre-->needed
// syntax for while loop
	int i=0;
	while(i<5) {
		System.out.println("Hello from while loop" +i);
		i++;
	}
	System.out.println("----------------------------------------------------------------");
	
	int j=5;
	while(j>0) {
		System.out.println("reverse while loop"+j);
	j--;
	}

}
}

