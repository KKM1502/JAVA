package com.test.question;

import java.util.Scanner;

public class Q042 {
//	�䱸����
//	��ǻ�Ͱ� 1~10 ������ ���� 1���� �����ϸ� ����ڰ� ���ߴ� ���α׷��� �����Ͻÿ�.
//
//	����..
//	�õ� Ƚ���� 10ȸ�� �Ѿ�� ���α׷��� �����Ͻÿ�.
//	��/���..
//	��ǻ�Ͱ� 1~10 ������ ���ڸ� 1�� �����߽��ϴ�.
//
//
//	����: 1 
//
//	Ʋ�Ƚ��ϴ�.
//
//
//	����: 3 
//
//	Ʋ�Ƚ��ϴ�.
//
//
//	����: 7 
//
//	Ʋ�Ƚ��ϴ�.
//
//
//	����: 2 
//
//	Ʋ�Ƚ��ϴ�.
//
//
//	����: 5 
//
//	�¾ҽ��ϴ�.
//
//
//	��ǻ�Ͱ� ������ ���ڴ� 5�Դϴ�.
//
//	������ ���ߴµ� �õ��� Ƚ���� 5ȸ�Դϴ�.
//
//
//	���α׷��� �����մϴ�.
	public static void main(String[] args) {
		int count = 1; // �õ�Ƚ��
		Scanner scan = new Scanner(System.in);
		//���� ���� ����
		int random = (int) (Math.random()*10) + 1;
		System.out.println("��ǻ�Ͱ� 1~10 ������ ���� 1�� �����߽��ϴ�.");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("����: ");
			int input = scan.nextInt();
			
			if(input == random) {
				System.out.printf("�¾ҽ��ϴ�.\n��ǻ�Ͱ� ������ ���ڴ� %d�Դϴ�.\n������ ���ߴµ� �õ��� Ƚ���� %dȸ�Դϴ�.",random,count);
				break;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				count ++;
			}
			
		}
		
		
	}
}
