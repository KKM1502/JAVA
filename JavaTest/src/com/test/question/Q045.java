package com.test.question;

import java.util.Scanner;

public class Q045 {
//	�䱸����
//	����ڰ� �Է��� ������ ���ڱ��� 369 ���� ������ ����Ͻÿ�.
//
//	����..
//	�ִ� 3�ڸ������� �Է��Ͻÿ�.
//	�Է�..
//	�ִ� ����: 50 
//
//	���..
//	1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ 14 15 ¦ 17 18 ¦ 20 
//	21 22 ¦ 24 25 ¦ 27 28 ¦ ¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 40 
//	41 42 ¦ 44 45 ¦ 47 48 ¦ 50
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ִ� ����: ");
		int input = scan.nextInt();
		if (input>1000) {
			System.out.println("���ڸ� ���ڸ� �Է��Ͻÿ�");
		}else {
			for (int i = 1; i <= input; i++) {
				if(i%3==0) {
					System.out.print("¦ ");
				}else {
					System.out.printf("%d ",i);
				}
			}
			
		}
	}
	
}


