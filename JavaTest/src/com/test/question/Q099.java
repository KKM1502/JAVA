package com.test.question;

public class Q099 {
	public static void main(String[] args) {
		//�ð� 1
		Time t1 = new Time(); //�⺻ ������ ȣ��
		System.out.println(t1.info());
	
		//�ð� 2
		Time t2 = new Time(2, 30, 45); //�����ε� ������ ȣ��
		System.out.println(t2.info());
	
		//�ð� 3
		Time t3 = new Time(1, 70, 30); //�����ε� ������ ȣ��
		System.out.println(t3.info());
	
		//�ð� 4
		Time t4 = new Time(30, 10); //�����ε� ������ ȣ��
		System.out.println(t4.info());
	
		//�ð� 5
		Time t5 = new Time(90, 10); //�����ε� ������ ȣ��
		System.out.println(t5.info());
	
		//�ð� 6
		Time t6 = new Time(50); //�����ε� ������ ȣ��
		System.out.println(t6.info());
	
		//�ð� 7
		Time t7 = new Time(10000); //�����ε� ������ ȣ��
		System.out.println(t7.info());
	}
}
