package com.Scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a:");
	int a=sc.nextInt();
	System.out.println("enter value of b:");
	int b=sc.nextInt();
	
	int sum= a+b;
	System.out.println("sum is :"+sum);
	int sub=a-b;
	System.out.println("substraction is:"+sub);
	int mul = a*b;
	System.out.println("Multiplication is:"+mul);
	int div =a/b;
	System.out.println("Division is:"+div);
	int mod =a%b;
	System.out.println("Mod is:"+mod);
	
	
	
	Scanner s=new Scanner (System.in);
	System.out.println("enter value of c:");
	int c=sc.nextInt();
	System.out.println("enter value of d:");
	int d=sc.nextInt();
	
	int add = c+d;
	System.out.println("Sum is:"+add);
	int subs =c-d;
	System.out.println("Substraction is :"+subs);
	int mult = c*d;
	System.out.println("Multiplication is:"+mult);
	int divide =c/d;
		System.out.println("Division is:"+divide);
		int rem=c%d;
		System.out.println("Remainder is :"+rem);
	// mul,div,mod
}
}
