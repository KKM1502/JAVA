package com.test.java;

import java.util.Scanner;

public class Ex21_Operator {
	public static void main(String[] args) {
//		Ex21_Operator
		
//		�䱸����] ����ڷκ��� ���� 1���� �Է� > ���� �ҹ������� �˻�?
		
//		�ó�����
//		1. Scanner ����
//		2. �� ���
//		3. ���� 1�� �Է¹ޱ�
//		4. �Է¹��� ���ڰ� ���� �ҹ������� �˻� (***)
//		5. ��� ���
		
		//ȭ�� ����
		Scanner scan= new Scanner(System.in);//1
		System.out.println("�����Է�:"); //2
		String input1 = scan.nextLine(); //���ڿ� ��ȯ, "a" 
		char c =input1.charAt(0); //���ڿ��� ù ������ char�� �̾Ƴ���.
		
		
		//97~ 122������ �������� �˻�    >> 4
		String result=(c>=97 && c<=122?"�ҹ����Դϴ�.":"�ҹ��ڰ� �ƴմϴ�.");//5-1
		System.out.printf("�Է¹��� ���� %c�� %s", c, result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
