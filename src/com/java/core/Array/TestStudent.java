package com.java.core.Array;

public class TestStudent {
public static void main(String[] args) {
	Student s=new Student();
	s.id=21;
	s.name="RAM";
	
	Student s1=new Student();
	s1.id=22;
	s1.name="HANUMAN";
	
	Student[] studentArray = {s,s1};

	for(int i=0; i<studentArray.length;i++){
	Student st = studentArray[i];
	System.out.println(st.id);
	System.out.println(st.name);
}
}
}