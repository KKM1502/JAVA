package com.test.question;


import java.util.Scanner;

public class Q080 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: ���ڿ�
//	�䱸����
//	������ �Է¹޾� �������� ����Ͻÿ�.
//
//	�Է�..
//	���� �Է� : ������ 
//
//	���..
//	���� ��� : "�ٳ���"
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�: ");//���� // 3 
		String input = scan.nextLine();
		System.out.printf("�������: \"");
		for (int i = 0; i < input.length(); i++) {
		
			char k =input.charAt(input.length()-i-1);
			System.out.printf("%c",k);
		}
		System.out.println("\"");

	}
}
