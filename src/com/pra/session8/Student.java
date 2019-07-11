package com.pra.session8;

public class Student {
	
	String name;
	private int rollNumber;
	
	public Student() {
		System.out.println("Defalut constructor");
	}
	
	public Student(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
		//Student s=new Student(Nirali,50);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
