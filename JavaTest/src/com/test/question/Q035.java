package com.test.question;

import java.util.Scanner;

public class Q035 {
//	�䱸����
//	������� �̸��� �λ��� Ƚ���� �Է� �޾� ����Ͻÿ�.
//
//	�Է�..
//	�̸�: ȫ�浿 
//
//	Ƚ��: 3 
//
//	���..
//	ȫ�浿�� �ȳ��ϼ���~
//	ȫ�浿�� �ȳ��ϼ���~
//	ȫ�浿�� �ȳ��ϼ���~
//	�Է�..
//	�̸�: �ƹ��� 
//
//	Ƚ��: 5 
//
//	���..
//	�ƹ����� �ȳ��ϼ���~
//	�ƹ����� �ȳ��ϼ���~
//	�ƹ����� �ȳ��ϼ���~
//	�ƹ����� �ȳ��ϼ���~
//	�ƹ����� �ȳ��ϼ���~

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		String input = scan.nextLine();
		
		System.out.print("Ƚ��: ");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.printf("%s�� �ȳ��ϼ���~\n",input);
		}
	}	
}
