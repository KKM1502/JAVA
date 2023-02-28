package com.test.question;

public class Student {
//	name: �̸�
//	age: ����
//	grade: �г�
//	classNumber: ��
//	number: ��ȣ
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this.name = "����";
		this.age = 0;
		this.grade = 0;
		this.classNumber = 0;
		this.number = 0;
	}
	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.grade = 0;
		this.classNumber = 0;
		this.number = 0;
	}
	public Student(int grade, int classNumber, int number) {
		this.name = "����";
		this.age = 0;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	
	
	public String info() {
		
		return String.format("%s(����: %s, �г�: %s, ��: %s, ��ȣ: %s)",this.name,this.age !=0?this.age +"��":"����",this.grade!=0?this.grade:"����",this.classNumber!=0?this.classNumber:"����",this.number!=0?this.number:"����");
		
	}
	
	
}
