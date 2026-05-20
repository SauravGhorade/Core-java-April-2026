package com.java.core.hasA;

public class Test {
	public static void main(String[] args) {
		Document d = new Document();
		d.setAdharNo("123234");
		d.setPanNo("jdfk2");
		d.setLicanse("1234568979");

		Student s = new Student();
		s.setRollno(101);
		s.setFirstName("Kumar");
		s.setLastName("Patel");
		s.setCity("Noida");
		s.setDoc(d);
		
		System.out.println(s.getRollno());
		System.out.println(s.getLastName());
		System.out.println(s.getCity());
		System.out.println(s.getDoc().getAdharNo());
		System.out.println(s.getDoc().getPanNo());
		System.out.println(s.getDoc().getLicanse());
	}
}
