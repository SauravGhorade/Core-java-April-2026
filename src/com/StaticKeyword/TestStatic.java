package com.StaticKeyword;

public class TestStatic {
	public static void main(String[] args) {

		System.out.println(Student.name);
		Student.printAge();

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");

		Student s = new Student();
		System.out.println(s.city);
		System.out.println(Student.name);
//		System.out.println(Student.city);
		Student.printAge();
	}
}
