package com.test.question;

public class Q098 {
	public static void main(String[] args) {
		//�л� 1
		Student s1 = new Student(); //�⺻ ������ ȣ��
		System.out.println(s1.info());
	
		//�л� 2
		Student s2= new Student("ȫ�浿", 13); //�����ε� ������ ȣ��
		System.out.println(s2.info());
	
		//�л� 3
		Student s3= new Student(3, 10, 30); //�����ε� ������ ȣ��
		System.out.println(s3.info());
	
		//�л� 4
		Student s4= new Student("�ƹ���", 12, 1, 5, 11); //�����ε� ������ ȣ��
		System.out.println(s4.info());
	}
}
