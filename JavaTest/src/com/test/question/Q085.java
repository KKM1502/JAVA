package com.test.question;

import java.util.Scanner;

public class Q085 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: ���ڿ�
//	�䱸����
//	�ֹ� ��� ��ȣ ��ȿ�� �˻縦 �Ͻÿ�.
//
//	����..
//	'-'�� �Է� ���� ������� �˻��Ͻÿ�.
//	�Է�..
//	�ֹε�Ϲ�ȣ: 951220-1021547 
//
//	���..
//	�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.
//	�Է�..
//	�ֹε�Ϲ�ȣ: 951220-1234567 
//
//	���..
//	�ùٸ��� ���� �ֹε�Ϲ�ȣ�Դϴ�.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ: ");
		String input = scan.nextLine();
		input = input.replace("-", "");
		int sum =0;
		for (int i = 0; i < 12; i++) {
			sum = sum + Integer.parseInt(input.substring(i, i+1))*(i%8 +2);
		}
		sum%=11;
		sum = 11 - (sum%10);
		
		if(sum == Integer.parseInt(input.substring(input.length()-1,input.length()))) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.");
		}else {
			System.out.println("�ùٸ��� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
	}
}
