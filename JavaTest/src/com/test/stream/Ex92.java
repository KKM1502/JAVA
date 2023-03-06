package com.test.stream;

import java.util.ArrayList;
import java.util.List;

public class Ex92 {
	public static void main(String[] args) {
		ma1();
		m2();
	}

	private static void m2() {
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("������",20,"����"));
		slist.add(new Student("������",10,"����"));
		slist.add(new Student("�ٴٴ�",204,"����"));
		slist.add(new Student("����",23,"����"));
		slist.add(new Student("������",20,"����"));
		slist.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		
	}

	private static void ma1() {
	
		//��ü�� ���ϼ�
		int n1 = 10;
		int n2 = 10;
		int n3 = 20;
	
		System.out.println(n1==n2);
		System.out.println(n1==n3);
		
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		String s3 = "�ƹ���";
		
		System.out.println(s1==s2); //�ּҰ� ��
		
		//boolean java.lang.String.equals(Object anObject)
		System.out.println(s1.equals(s2)); //equals �޼ҵ� ������
		System.out.println(s2.equals(s3)); 
		Student t1 = new Student("����",25, "M");
		Student t2 = new Student("����ȣ",26, "M");
		Student t3 = new Student("������",27, "F");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
	}
}

class Student{
	private String name;
	private int age;
	private String gender;
	
	public Student(String name,int age,String gender) {
		name =this.name;
		age = this.age;
		gender = this.gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}