package com.test.question;

public class Q017 {
	public static void main(String[] args) {
//		����..
//		��� �� �븮 �� ���� �� ����
//		void position(String)
//		void position(String, String)
//		void position(String, String, String)
//		void position(String, String, String, String)
		
//		ȣ��..
			position("ȫ�浿");
			System.out.println();
			position("ȫ�浿", "���缮");
			System.out.println();
			position("ȫ�浿", "���缮", "�ڸ��");
			System.out.println();
			position("ȫ�浿", "���缮", "�ڸ��", "������");
		
//		���..
//		��� : ȫ�浿
//		         
//		��� : ȫ�浿
//		�븮 : ���缮
//
//		��� : ȫ�浿
//		�븮 : ���缮
//		���� : �ڸ��
//
//		��� : ȫ�浿
//		�븮 : ���缮
//		���� : �ڸ��
//		���� : ������
		
		
	}//main
	public static void position(String n) {
		System.out.printf("��� : %s\n",n);
	}
	public static void position(String n,String n2) {
		System.out.printf("��� : %s\n�븮 : %s\n",n,n2);
	}
	public static void position(String n,String n2, String n3) {
		System.out.printf("��� : %s\n�븮 : %s\n���� : %s\n",n,n2,n3);
	}
	public static void position(String n,String n2, String n3, String n4) {
		System.out.printf("��� : %s\n�븮 : %s\n���� : %s\n���� : %s\n",n,n2,n3,n4);
	}
	
}
