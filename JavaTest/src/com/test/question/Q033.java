package com.test.question;

import java.util.Scanner;

public class Q033 {
	public static void main(String[] args) {
//		�䱸����
//		�⵵�� �Է¹޾� �ش� �⵵�� '���' ���� '����' ���� ����Ͻÿ�.
//
//		����..
//		a. �⵵�� 4�� ������.
//		�������� b �˻�
//		�������� ������ "���"
//		b. �⵵�� 100���� ������.
//		�������� c �˻�
//		�������� ������ "����"
//		c. �⵵�� 400���� ������.
//		�������� "����"
//		�������� ������ "���"
//		�Է�..
//		�⵵ �Է�: 2019 
//
//		���..
//		2019���� '���'�Դϴ�.
//		�Է�..
//		�⵵ �Է�: 2020 
//
//		���..
//		2020���� '����'�Դϴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		int input = scan.nextInt();
		
		String result = test(input);
		System.out.printf("%d���� '%s'�Դϴ�",input, result);
		
		
	}//main

	private static String test(int i) {
		// ���� �˻�
		if ((i%4)==0) {
			
			if((i%100)==0) {
				
				if((i%400)==0) {
					
					return "����";
				}
				else {
					return "���";
				}
				
			}
			else {
				return "����";
			}
		}
		else {
			return "���";
		}
		
	}
}
