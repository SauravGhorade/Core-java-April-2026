package com.paramConstr;

public class Student {
	public String name;
	public int age;
	public String city;
	public Student(int age,String name,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
		
	}
	public void printName() {
		System.out.println("Name is :"+name);
		System.out.println(age);
		System.out.println("city is:"+city);
	}

}
