package com.test.question;

import java.util.Scanner;

public class Q030 {
	public static void main(String[] args) {
//		�䱸����
//		������ 1���� �Է¹޾� ��/�ҹ��� ��ȯ�� �� �� ����Ͻÿ�.
//
//		����..
//		��ȿ�� �˻縦 �Ͻÿ�.(�����ڸ� �Է� ����)
//		�Է�..
//		����: a 
//
//		���..
//		'a'�� �빮�ڴ� 'A'�Դϴ�.
//		�Է�..
//		����: F 
//
//		���..
//		'F'�� �ҹ��ڴ� 'f'�Դϴ�.
//		�Է�..
//		����: �� 
//
//		���..
//		�����ڸ� �Է��Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("����(�����ڸ� �Է� ����): ");
		char input = scan.nextLine().charAt(0);
		
		if('a'<=input && input<'z' ) {
			System.out.printf("%c �� �빮�ڴ� '%c'�Դϴ�",input,input-32);
		}
		else if('A'<=input && input<'Z' ) {
			System.out.printf("%c �� �ҹ��ڴ� '%c'�Դϴ�",input,input+32);
		}else {
			System.out.println("�����ڸ� �Է�");
		}
		
		

		
		
	}//main
	
	
	
	
}

