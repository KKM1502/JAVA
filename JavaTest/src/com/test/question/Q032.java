package com.test.question;

import java.util.Scanner;

public class Q032 {
	public static void main(String[] args) {
//		�䱸����
//		���� ����� ����Ͻÿ�.
//
//		����..
//		���� ����: 30��
//		�ʰ� 10�д�: 2,000��
//		�Է�..
//		[���� �ð�]
//
//		��: 13 
//
//		��: 30 
//
//
//		[���� �ð�]
//
//		��: 14 
//
//		��: 20 
//
//		���..
//		���� ����� 4,000���Դϴ�.

		//���� �ð� 
		Scanner scan = new Scanner(System.in);
		System.out.print("��: ");
		int h = scan.nextInt();
		System.out.print("��: ");
		int m = scan.nextInt();	
		System.out.println();
		
		//�����ð�
		System.out.print("��: ");
		int hout = scan.nextInt();
		System.out.print("��: ");
		int mout = scan.nextInt();
		System.out.println();
		
		
		System.out.printf("���� ����� %,d���Դϴ�.",(((hout*60+mout)-(h*60+m))-30)/10*2000 );
	}
}
